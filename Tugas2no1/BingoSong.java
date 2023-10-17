package Tugas2;

public class BingoSong {
        public BingoSong() {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And Bingo was his name-o.");
            for (int i = 0; i < 5; i++) {
                String claps = "";
                for (int j = 0; j < 5 - i; j++) {
                    claps += "(clap)-";
                }
                String line = claps + "N-G-O";
                System.out.println(line);
            }
            System.out.println("And Bingo was his name-o.");
        }
    }

