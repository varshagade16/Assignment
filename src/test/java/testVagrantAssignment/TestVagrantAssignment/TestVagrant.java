package testVagrantAssignment.TestVagrantAssignment;

import java.util.ArrayList;

public class TestVagrant {
	

		public static void main(String[] args) {

			ArrayList<String> songList = new ArrayList<>(3);
			songList.add("S1");
			songList.add("S2");
			songList.add("S3");
			System.out.println("Initial playlist: " + songList);


			String s4 = "S4";

			String s1 = "S1";
			songList.remove(s1);
			songList.add(2, s4);
			System.out.println("When S4 Song is Played ->" + songList);


			String s2 = "S2";
			if (songList.contains(s2)) {

				songList.remove(s2);
			}

			songList.add(2, s2);
			System.out.println("When S2 Song is Played ->" + songList);


			String s3 = "S3";
			if (songList.contains(s3)) {

				songList.remove(s3);
			}

			songList.add(2, s1);
			System.out.println("When S1 Song is Played ->" + songList);
		}

}
