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

        if ((row < 0) || (row > rowMax)) {
            return neighbours;
        }

        int colPerRowMax = matrix.get(row).size() - 1;

        if ((col < 0) || (col > colPerRowMax)) {
            return neighbours;
        }

        var lowerVerticalNeighbourRow = row + 1;
        var leftHorizontalNeighbourCol = col - 1;
        var upVerticalNeighbourRow = row - 1;
        var rightHorizontalNeighbourCol = col + 1;

        if (lowerVerticalNeighbourRow <= rowMax) {
            var lowerVerticalNeighbour = matrix.get(lowerVerticalNeighbourRow).get(col);
            neighbours.add(lowerVerticalNeighbour);
        }

        if (leftHorizontalNeighbourCol >= 0) {
            var leftHorizontalNeighbour = matrix.get(row).get(leftHorizontalNeighbourCol);
            neighbours.add(leftHorizontalNeighbour);
        }

        if (upVerticalNeighbourRow >= 0) {
            var upVerticalNeighbour = matrix.get(upVerticalNeighbourRow).get(col);
            neighbours.add(upVerticalNeighbour);
        }

        if (rightHorizontalNeighbourCol <= colPerRowMax) {
            var rightHorizontalNeighbour = matrix.get(row).get(rightHorizontalNeighbourCol);
            neighbours.add(rightHorizontalNeighbour);
        }
        neighbours.sort(Comparator.naturalOrder());
        return neighbours;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int rowsCount = readInt(reader);
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