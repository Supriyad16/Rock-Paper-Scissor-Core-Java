package com.sample.pro1;

import java.util.*;
public class RPS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("********************************************");
		System.out.println("*            ROCK PAPER SCISSOR            *");
		System.out.println("********************************************");
		System.out.println("Enter your name :");
		String n = in.next();
		int a=10;
		int H = 0;
		int Comp = 0;
		int num = 0;
		
		while(a>0) {
			display();
			System.out.println("Enter your option");
			
			String s = in.next();
			Random r = new Random();
			if(num>3) {
				System.out.println("Final score:");
				System.out.println("Human: "+H+" | Comp: "+Comp);
				System.out.println();
				if(H>Comp) {
					System.out.println("*****" +n+ "WON THE MATCH *****");
				}
				else if(H==Comp) {
					System.out.println("***** MATCH DRAW *****");
					
				}
				else {
					System.out.println("***** COMP WON THE MATCH *****");
					System.out.println("Better Luck Next Time");
				}
				System.exit(0);
			}
			
			if(s.equals("R")) {
				int comp = 10+r.nextInt(3)+1;
				if(comp==11) {
					System.out.println("you: Rock");
					System.out.println("Comp: Rock");
					System.out.println("Result: Draw");
					num =num+1;
					H=H+1;
					Comp=Comp+1;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				else if(comp==12) {
					System.out.println("you: Rock");
					System.out.println("Comp: paper");
					System.out.println("Result:" +n+ " you lose");
					num = num+1;
					H=H+0;
					Comp=Comp+1;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				else if(comp==13) {
					System.out.println("you: Rock");
					System.out.println("Comp: Scissor");
					System.out.println("Result:" +n+  "you won");
					num = num+1;
					H=H+1;
					Comp=Comp+0;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				
			}
			else if(s.equals("P")) {
				int comp = 20+r.nextInt(3)+1;
				if(comp==21) {
					System.out.println("you: Paper");
					System.out.println("Comp: Paper");
					System.out.println("Result: Draw");
					num =num+1;
					H=H+1;
					Comp=Comp+1;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				else if(comp==22) {
					System.out.println("you: Paper");
					System.out.println("Comp: scissor");
					System.out.println("Result:" +n+ " you lose");
					num = num+1;
					H=H+0;
					Comp=Comp+1;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				else if(comp==23) {
					System.out.println("you: Paper");
					System.out.println("Comp: Rock");
					System.out.println("Result:" +n+ " you won");
					num = num+1;
					H=H+1;
					Comp=Comp+0;
					System.out.println("You: "+H+" | Comp: "+Comp);
					System.out.println();
				}
				
			}
			else if(s.equals("S")) {
			int comp = 30+r.nextInt(3)+1;
			if(comp==31) {
				System.out.println("you: Scissor");
				System.out.println("Comp: Scissor");
				System.out.println("Result: Draw");
				num =num+1;
				H=H+1;
				Comp=Comp+1;
				System.out.println("You: "+H+" | Comp: "+Comp);
				System.out.println();
			}
			else if(comp==32) {
				System.out.println("you: Scissor");
				System.out.println("Comp: Rock");
				System.out.println("Result:" +n+ " you lose");
				num = num+1;
				H=H+0;
				Comp=Comp+1;
				System.out.println("You: "+H+" | Comp: "+Comp);
				System.out.println();
			}
			else if(comp==33) {
				System.out.println("you: Scissor");
				System.out.println("Comp: Paper");
				System.out.println("Result:" +n+ " you won");
				num = num+1;
				H=H+1;
				Comp=Comp+0;
				System.out.println("You: "+H+" | Comp: "+Comp);
				System.out.println();
				}
			
			}
			else {
				System.out.println("Invalid key.");
				System.out.println("Try Again");
				num = num--;
			}
			
		}
	}
		
		public  static void display() {
			System.out.println("1.Rock: R");
			System.out.println("2.Paper: P");
			System.out.println("3.Scissor: S");
		}
	}
	
	
