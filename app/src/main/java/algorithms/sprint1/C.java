package algorithms.sprint1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;

public class C {

    private static List<Integer> getNeighbours( List<List<Integer>> matrix, int row,  int col) {
         var neighbours = new ArrayList<Integer>();

         int rowMax = matrix.size() - 1;
        if ((row >= 0) && (row <= rowMax)) {
             int colPerRowMax = matrix.get(row).size() - 1;
            if ((col >= 0) && (col <= colPerRowMax)) {
                 var lowerVerticalNeighbour = matrix.get(row + 1).get(col);
                neighbours.add(lowerVerticalNeighbour);
            }
        }

        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                if ((row == i) && (col == j)) {
                    if (i < matrix.size() - 1) {
                        var lowerVerticalNeighbour = matrix.get(i + 1).get(j);
                        neighbours.add(lowerVerticalNeighbour);
                    }
                    if (j > 0) {
                        var leftHorizontalNeighbour = matrix.get(i).get(j - 1);
                        neighbours.add(leftHorizontalNeighbour);
                    }
                    if (i > 0) {
                        var upVerticalNeighbour = matrix.get(i - 1).get(j);
                        neighbours.add(upVerticalNeighbour);
                    }
                    if (j < matrix.get(i).size()) {
                        var rightHorizontalNeighbour = matrix.get(i).get(j + 1);
                        neighbours.add(rightHorizontalNeighbour);
                    }
                    break;
                }
            }
        }
        return neighbours;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int rowsCount = readInt(reader);
            int colsCount = readInt(reader);
            List<List<Integer>> matrix = readMatrix(reader, rowsCount);
            int rowId = readInt(reader);
            int colId = readInt(reader);
            List<Integer> neighbours = getNeighbours(matrix, rowId, colId);
            for (int element : neighbours) {
                System.out.print(element + " ");
            }
        }
    }


    private static int readInt(BufferedReader reader) throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.asList(reader.readLine().split(" "))
                .stream()
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());
    }

    private static List<List<Integer>> readMatrix(BufferedReader reader, int rowsCount) throws IOException {
        List<List<Integer>> matrix = new ArrayList<>(rowsCount);
        for (int i = 0; i < rowsCount; i++) {
            matrix.add(readList(reader));
        }
        return matrix;
    }
}