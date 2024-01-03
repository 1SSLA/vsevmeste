class matrix{
    private double[][] data;
    private int rows;
    private int columns;


    public matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    }


    public matrix add(matrix other) {
        matrix result = new matrix(this.rows, this.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }



    public matrix multiply(double scalar) {
        matrix result = new matrix(this.rows, this.columns);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }



    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        matrix matrix1 = new matrix(2, 3);
        matrix1.data = new double[][]{{1, 2, 3}, {4, 5, 6}};

        matrix matrix2 = new matrix(2, 3);
        matrix2.data = new double[][]{{7, 8, 9}, {10, 11, 12}};


        matrix sum = matrix1.add(matrix2);
        System.out.println();
        sum.print();


        matrix scaled = matrix1.multiply(3);
        System.out.println();
        scaled.print();

    }
}