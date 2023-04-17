package quiz.D;

import java.util.Scanner;

import omok.Board;

public class D05_Omok {
	
	/*
	 	오목을 만들어주세요
	 */
	
	// Hint 판 만드는 방법 - ㅂ누르고 한자
	
//	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			for(int j = 0; j < 10; j++) {
//			System.out.print("┼ ");
//			}
//			System.out.println();
//		}
//		
//		// Hint - 돌 놓는 방법
//		char[][] omok = {
//				{'┌', '┬', '┬', '┬', '○', '●', '┬', '┐'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'├', '┼', '┼', '┼', '┼', '┼', '┼', '┤'},
//				{'└', '┴', '┴', '┴', '┴', '┴', '┴', '┘'},
//		};
//		
//		for(int i = 0; i < omok.length; i++) {
//			for(int j = 0; j < omok[i].length; j++) {
//				System.out.printf("%c ", omok[i][j]);
//			}
//			System.out.println();
//		}
//	}
	final private static char[] icons = 
		{'┌', '┬', '┐', '├', '┼',  '┤', '└','┴','┘', '○', '●'};
	
	final public static int WHITE_STONE = 9;
	final public static int BLACK_STONE = 10;
	
	private int[][] board = {
			{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5},
			{6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8},
	};
	
	public void print() {
		System.out.println(" ① ② ③ ④ ⑤ ⑥ ⑦ ⑧ ⑨ ⑩ ⑪ ⑫ ⑬ ⑭ ⑮");
		for(int i = 0; i < board.length; i++) {
			System.out.print((char)('A' + i));
			for(int j = 0; j < board[i].length; j++) {
				if(j == 14) {
					System.out.print(icons[board[i][j]] + " ");
				} else {
					System.out.print(icons[board[i][j]] + "─");
				}
				
			}
			System.out.println();
		}
	}
	
	public boolean put(String location, int color) {
		if(color != WHITE_STONE && color != BLACK_STONE) {
			System.out.println("[ERROR]"
					+ "2번째 파라미터에는 D05_Omok.WHITE_STONE 또는"
					+ "D05_Omok_BLACK_STONE을 사용해주세요");
			return false;
		}
		
		// A15
		// "".substring(index) : 해당 위치부터 마지막까지 문자열을 자른다
		int row = location.charAt(0) -'A';
		int col = Integer.parseInt(location.substring(1)) - 1;
		
		if(row < 0 || row > 14 || col < 0 || col > 14) {
			System.out.println("잘못된 위치를 입력하셨습니다.");
			return false;
		}
		board[row][col] = color;
		return true;
	}
	
	private int[] getIndexes(String location) {
		return new int[] {
				location.charAt(0) -'A',
				Integer.parseInt(location.substring(1)) - 1
		};
	}
	
	public boolean checkWin(String location, int color) {
		int[] rowCol = getIndexes(location);
		
		int row = rowCol[0];
		int col = rowCol[1];
		// 현재 돌의 위치로부터 가로로 오목 체크
		
		int count = 1;
		// 현재 돌의 위치로부터 가로 오른쪽 체크
		for(int i = col + 1; i < board[0].length; i++) {
			if(board[row][i] == color) {
				++count;
			} else {
				break;
			}
		}
		// 현재 돌의 위치로부터 가로 오른쪽 체크
		for(int i = col - 1; i >= 0; i--) {
			if(board[row][i] == color) {
				++count;
			} else {
				break;
			}
		}
		
		if(count == 5) {
			return true;
		}
		
		count = 1;
		// 현재 돌의 위치로부터 세로로 오목 체크
		// (1) 현재 돌의 위치로부터 세로 위쪽 체크
		for(int i = row - 1; i >= 0; i--) {
			if(board[i][col] == color) {
				++count;
			} else {
				break;
			}
		}
		
		// (2) 현재 돌의 위치로부터 세로 아래쪽 체크
		for(int i = row + 1; i < board.length; i++) {
			if(board[i][col] == color) {
				++count;
			} else {
				break;
			}
		}
		if(count == 5) {
			return true;
		}
		
		// 현재 돌의 위치로부터 대각선으로 오목 체크
		// 1사분면 체크
		count = 1;
		for(int i = 1; row - i >= 0 && col + i < board[0].length; i++) {
			if(board[row - i][col + i] == color) {
				++count;
			} else {
				break;
			}
		}
		// 3사분면 체크
		for(int i = 1; row + i < board.length && col - i >= 0; i++) {
			if(board[row + i][col - i] == color) {
				++count;
			} else {
				break;
			}
		}

		if(count == 5) {
			return true;
		}
		
		count = 1;
		// 2사분면 체크
		for(int i = 1; row - i >= 0 && col - i >= 0; i++) {
			if(board[row - i][col - i] == color) {
				++count;
			} else {
				break;
			}
		}
		// 4사분면 체크
		for(int i = 1; row + i < board.length && col + i < board[0].length; i++) {
			if(board[row + i][col + i] == color) {
				++count;
			} else {
				break;
			}
		}
		
		if(count == 5) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		D05_Omok game = new D05_Omok();
		Scanner sc = new Scanner(System.in);
		int win = 0;
		game.print();
		while(true) {
			System.out.println("Black's turn(input location)>>");
			String location = sc.nextLine();
			game.put(location, D05_Omok.BLACK_STONE);
			if(game.checkWin(location, BLACK_STONE)) {
				break;
			}
			game.print();
			System.out.println("White's turn(input location)>>");
			location = sc.nextLine();
			game.put(location, D05_Omok.WHITE_STONE);
			game.checkWin(location, WHITE_STONE);
			if(game.checkWin(location, WHITE_STONE)) {
				win = 1;
				break;
			}
			game.print();
		}
		if(win == 0) {
			System.out.println("Black Win!");
		} else {
			System.out.println("White Win!");
		}
	}
}

