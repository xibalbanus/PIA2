package jebl.evolution.align.scores;

public class Blosum70 extends AminoAcidScores {

  private final float[][] residueScores = {

            /*  A   R   N   D   C   Q   E   G   H   I   L   K   M   F   P   S   T   W   Y   V */
            {   4},
            {  -2,  6},
            {  -2, -1,  6},
            {  -2, -2,  1,  6},
            {  -1, -4, -3, -4,  9},
            {  -1,  1,  0, -1, -3,  6},
            {  -1,  0,  0,  1, -4,  2,  5},
            {   0, -3, -1, -2, -3, -2, -2,  6},
            {  -2,  0,  0, -1, -4,  1,  0, -2,  8},
            {  -2, -3, -4, -4, -1, -3, -4, -4, -4,  4},
            {  -2, -3, -4, -4, -2, -2, -3, -4, -3,  2,  4},
            {  -1,  2,  0, -1, -4,  1,  1, -2, -1, -3, -3,  5},
            {  -1, -2, -2, -3, -2,  0, -2, -3, -2,  1,  2, -2,  6},
            {  -2, -3, -3, -4, -2, -3, -4, -4, -1,  0,  0, -3,  0,  6},
            {  -1, -2, -2, -2, -3, -2, -1, -3, -2, -3, -3, -1, -3, -4,  8},
            {   1, -1,  0,  0, -1,  0,  0, -1, -1, -3, -3,  0, -2, -3, -1,  4},
            {   0, -1,  0, -1, -1, -1, -1, -2, -2, -1, -2, -1, -1, -2, -1,  1,  5},
            {  -3, -3, -4, -5, -3, -2, -4, -3, -2, -3, -2, -3, -2,  1, -4, -3, -3, 11},
            {  -2, -2, -2, -4, -3, -2, -3, -4,  2, -1, -1, -2, -1,  3, -3, -2, -2,  2,  7},
            {   0, -3, -3, -4, -1, -2, -3, -4, -3,  3,  1, -3,  1, -1, -3, -2,  0, -3, -2,  4}};

  public Blosum70() { buildScores(residueScores); }
}
