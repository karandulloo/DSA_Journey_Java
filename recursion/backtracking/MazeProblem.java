package recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

class MazeProblem {
	public static void main(String[] args) {
		boolean[][] maze = {
				{false, false, false},
				{false, false, false},
				{false, false, false}};

		//to reach path 2,2 and can only use D and R
		int r = 0;
		int c = 0;
//		int count = 0;
		String path = "";
//		findAllPath(maze, r, c, path);
//		printPathWithDiagonal(r, c, path);
//		printPathWithAllDirections(maze, r, c, path);
		printAllPath(maze, r, c, new int[maze.length][maze[0].length], 0);
//		printPathWithObstacle(r, c, path);
//		System.out.println(findAllPath(r, c, path));
//		int totalPaths = countPath(r, c);
//		System.out.println(totalPaths);
//		printPathWithDiagonal(r, c, path);
	}

//	static void findAllPath(boolean[][] maze, int r, int c, String path) {
//		if (r == 2 && c == 2) {
//			System.out.println(path);
//			return;
//		}
//		//go right
//		if (c < 2) {
//			findAllPath(maze, r, c + 1, path + "R");
//		}
//		if (r < 2) {
//			//go down
//			findAllPath(maze, r + 1, c, path + "D");
//		}
//	}

//	static ArrayList<String> findAllPath(int r, int c, String path) {
//		ArrayList<String> list = new ArrayList<>();
//
//		// base case: destination reached
//		if (r == 2 && c == 2) {
//			list.add(path);
//			return list;
//		}
//
//		// go right if possible
//		if (c < 2) {
//			list.addAll(findAllPath(r, c + 1, path + "R"));
//		}
//
//		// go down if possible
//		if (r < 2) {
//			list.addAll(findAllPath(r + 1, c, path + "D"));
//		}
//
//		return list;
//	}

//	static int countPath(int r, int c) {
//		if (r == 2 || c == 2) {
//			return 1;
//		}
//		//go right
//		int right = countPath(r, c + 1);
//
//		//go down
//		int left = countPath(r + 1, c);
//
//		return left + right;
//	}

//	static void printPathWithDiagonal(int r, int c, String path) {
//		if (r == 2 && c == 2) {
//			System.out.println(path);
//			return;
//		}
//
//		if (r < 2) {
//			printPathWithDiagonal(r + 1, c, path + "D");
//		}
//
//		if (c < 2) {
//			printPathWithDiagonal(r, c + 1, path + "R");
//		}
//
//		if (r < 2 && c < 2) {
//			printPathWithDiagonal(r + 1, c + 1, path + "Di");
//		}
//	}

//	static void printPathWithObstacle(int r, int c, String path) {
//		if (r == 2 && c == 2) {
//			System.out.println(path);
//			return;
//		}
//
//		if (r == 1 && c == 1) {
//			return;
//		}
//
//		if (r < 2) {
//			printPathWithObstacle(r + 1, c, path + "D");
//		}
//
//		if (c < 2) {
//			printPathWithObstacle(r, c + 1, path + "R");
//		}
//	}

//	static void printAllPathINAllDirections(boolean[][] maze, int r, int c, String path) {
//		if (r == maze.length - 1 && c == maze[0].length - 1) {
//			System.out.println(path);
//			return;
//		}
//      this condition is for restriction
//		if (maze[r][c]) {
//			return;
//		}
//
//		if (maze[r][c]) {
//			return;
//		}
//
//		maze[r][c] = true;
//
//		if (r < maze.length - 1) {
//			printAllPathINAllDirections(maze, r + 1, c, path + "D");
//		}
//
//		if (c < maze[0].length - 1) {
//			printAllPathINAllDirections(maze, r, c + 1, path + "R");
//		}
//
//		if (r > 0) {
//			printAllPathINAllDirections(maze, r - 1, c, path + "U");
//		}
//
//		if (c > 0) {
//			printAllPathINAllDirections(maze, r, c - 1, path + "L");
//		}
//
//		//here the functions will be returned so using backtracking we will make it back to false so that other paths can also implemented
//		maze[r][c] = false;
//	}

	static void printAllPath(boolean[][] maze, int r, int c, int[][] path, int step) {
		if (r == maze.length - 1 && c == maze[0].length - 1) {
			for (int[] arr : path) {
				System.out.print(Arrays.toString(arr));
			}
//			System.out.println(maze);
			System.out.println();
			return;
		}

		if (maze[r][c]) {
			return;
		}

		maze[r][c] = true;
		path[r][c] = step;

		if (r < maze.length - 1) {
			printAllPath(maze, r + 1, c, path, step + 1);
		}

		if (c < maze[0].length - 1) {
			printAllPath(maze, r, c + 1, path, step + 1);
		}

		if (r > 0) {
			printAllPath(maze, r - 1, c, path, step + 1);
		}

		if (c > 0) {
			printAllPath(maze, r, c - 1, path, step + 1);
		}

		//here the functions will be returned, so using backtracking we will make it back to false so that other paths can also implemented
		maze[r][c] = false;
		path[r][c] = 0;
	}
}