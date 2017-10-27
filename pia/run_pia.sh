aalength="30"			#minimum aminoacid sequence length
search_type="single"	#single or set
gene="r_opsin"			#gene(set) name
evalue="0.0000000001"	#E-value threshold for BLAST search
blasthits="100"			#Number of BLAST hits to retain for the analysis

for file in *.fasta ; do

	mkdir pia
	cd pia
	mkdir results_${file}
	cd results_${file}
	cp ../../${file} ./	

	python ~/apps/pia/get_orfs_or_cdss.py $file fasta 1 ORF open top $aalength both ORF_nuc.fasta ORF_prot.fasta > stdout 2>&1

	perl ~/apps/pia/pia.pl ORF_prot.fasta $search_type $gene mafft $evalue $blasthits

	perl ~/apps/pia/phylographics/makeRtrees.pl treeout.tab trees.pdf phylogram no None Rfile yes no >tree.R

	R --vanilla < tree.R 2>log.txt

	~/apps/pia/post_pia.sh
	cd ../../

done



