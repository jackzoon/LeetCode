package com.halen.step01;

/**
 *       机器人能否返回原点，LeetCode第657题
 * @author halen
 *
 */
public class P_657 {
	public boolean judgeCircle(String moves) {
        int[] move = {0,0};
        for(int i=0;i<moves.length();i++) {
        	if(moves.charAt(i)=='R') {
        		move[0] = move[0]+1;
        	}else if(moves.charAt(i)=='L') {
        		move[0] = move[0]-1;
        	}else if(moves.charAt(i)=='U') {
        		move[1] = move[1] + 1;
        	}else if(moves.charAt(i)=='D') {
        		move[1] = move[1] - 1;
        	}
        }
        return move[0]+move[1] == 0;
    }
	
	public boolean judgeCircle_2(String moves) {
        int[] move = new int[26];
        for(char c:moves.toCharArray()) {
        	move[c-'A']++;
        }
        return move['R'-'A']==move['L'-'A'] && move['U'-'A']==move['D'-'A'];
        
    }
	
	public static void main(String[] args) {
		P_657 p = new P_657();
		String moves = "UD";
		System.out.println(p.judgeCircle(moves));
	}
}
