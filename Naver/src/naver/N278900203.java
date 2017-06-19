package naver;

import java.io.IOException;

import javax.swing.JOptionPane;

class Newteam {
	String name;
	int score;
	int home;
	int injury;
	int recent;
	int ranking;
	int supervisor;
	int ability;
	int history;
	int scorer;
	int finalranking;
	int keeper;
	double total;
}

public class N278900203 {
	public static void main(String[] args) throws IOException {

		Newteam team1 = new Newteam();
		Newteam team2 = new Newteam();
		team1.name = JOptionPane.showInputDialog("1번팀의 이름은?");
		team2.name = JOptionPane.showInputDialog("2번팀의 이름은?");
		String[] buttons = { team1.name, team2.name, "중립경기장" };
		int home = JOptionPane.showOptionDialog(null, "어느팀의 홈인가요?", "홈,어웨이", 0, JOptionPane.INFORMATION_MESSAGE, null,
				buttons, buttons[0]);

		if (home == 0) {
			team1.home = 3;
			team2.home = 0;
		} else if (home == 1) {
			team1.home = 0;
			team2.home = 3;
		} else if (home == 2) {
			team1.home = 0;
			team2.home = 0;
		}
		int i = JOptionPane.showConfirmDialog(null, "Table함수를 실행하여 인터넷의 순위 정보를 얻기",
				team1.name + "와(과) " + team2.name + "의 현재 순위와 최근 5경기 전적을 확인하시오", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		if (i != 0) {
			JOptionPane.showMessageDialog(null, "더이상 진행할 수 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		team1.ranking = 20 - Integer.parseInt(JOptionPane.showInputDialog(team1.name + "의 현재 순위는?"));
		team2.ranking = 20 - Integer.parseInt(JOptionPane.showInputDialog(team2.name + "의 현재 순위는?"));
		team1.recent = Integer.parseInt(JOptionPane.showInputDialog(team1.name + "이(가) 최근 5경기 얻어낸 승점은?"));
		team2.recent = Integer.parseInt(JOptionPane.showInputDialog(team2.name + "이(가) 최근 5경기 얻어낸 승점은?"));
		team1.finalranking = 20 - Integer.parseInt(JOptionPane.showInputDialog(team1.name + "의 최종 예상 순위는?"));
		team2.finalranking = 20 - Integer.parseInt(JOptionPane.showInputDialog(team2.name + "의 최종 예상 순위는?"));
		int i2 = JOptionPane.showConfirmDialog(null, "Injury함수를 실행하여 부상 정보를 확인하시오",
				team1.name + "와(과) " + team2.name + "의 부상자수를 확인하시오", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		if (i2 != 0) {
			JOptionPane.showMessageDialog(null, "더이상 진행할 수 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String[] buttons2 = { "베스트 11에는 영향 없음", "베스트 11에서 1-2명 영향", "베스트 11에서 3명 이상 영향" };
		int injury = JOptionPane.showOptionDialog(null, team1.name + "의 부상자 수는?", "부상자 수", 0,
				JOptionPane.INFORMATION_MESSAGE, null, buttons2, buttons2[0]);
		if (injury == 0) {
			team1.injury = 0;
		} else if (injury == 1) {
			team1.injury = -1;
		} else if (injury == 2) {
			team1.injury = -3;
		}
		String[] buttons3 = { "베스트 11에는 영향 없음", "베스트 11에서 1-2명 영향", "베스트 11에서 3명 이상 영향" };
		int injury2 = JOptionPane.showOptionDialog(null, team2.name + "의 부상자 수는?", "부상자 수", 0,
				JOptionPane.INFORMATION_MESSAGE, null, buttons3, buttons3[0]);
		if (injury2 == 0) {
			team2.injury = 0;
		} else if (injury2 == 1) {
			team2.injury = -1;
		} else if (injury2 == 2) {
			team2.injury = -3;
		}
		String[] buttons1 = { "잘 모름", "조금 유명", "유명", "매우 유명", "역대 TOP" };
		int supervisor = JOptionPane.showOptionDialog(null, team1.name + "감독의 역량이 어떻게 되나요?", "감독의 역량", 0,
				JOptionPane.INFORMATION_MESSAGE, null, buttons1, buttons1[0]);
		if (supervisor == 0) {
			team1.supervisor = 1;
		} else if (supervisor == 1) {
			team1.supervisor = 2;
		} else if (supervisor == 2) {
			team1.supervisor = 3;
		} else if (supervisor == 3) {
			team1.supervisor = 4;
		} else if (supervisor == 4) {
			team1.supervisor = 5;
		}
		String[] buttons11 = { "잘 모름", "조금 유명", "유명", "매우 유명", "역대 TOP" };
		int supervisor1 = JOptionPane.showOptionDialog(null, team2.name + "감독의 역량이 어떻게 되나요?", "감독의 역량", 0,
				JOptionPane.INFORMATION_MESSAGE, null, buttons11, buttons11[0]);

		if (supervisor1 == 0) {
			team2.supervisor = 1;
		} else if (supervisor1 == 1) {
			team2.supervisor = 2;
		} else if (supervisor1 == 2) {
			team2.supervisor = 3;
		} else if (supervisor1 == 3) {
			team2.supervisor = 4;
		} else if (supervisor1 == 4) {
			team2.supervisor = 5;
		}
		if ((team1.ranking - team2.ranking) * 2 >= 10) {
			team1.ability = 5;
		} else if ((team2.ranking - team1.ranking) * 2 >= 10) {
			team2.ability = 5;
		} else {
			team1.ability = team2.ability = 0;
		}
		int i4 = JOptionPane.showConfirmDialog(null, "Goasl함수를 실행하여 득점 현황을 확인하시오",
				team1.name + "와 " + team2.name + "의 역대 전적을 확인하시오", JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE);
		if (i4 != 0) {
			JOptionPane.showMessageDialog(null, "더이상 진행할 수 없습니다.", "오류", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String[] buttons1111 = { team1.name, team2.name, "두 팀 모두 ", "양쪽 다 없다" };
		int scorer = JOptionPane.showOptionDialog(null, "어느팀에 스코어러가 있습니까?", "스코어러", 0, JOptionPane.INFORMATION_MESSAGE,
				null, buttons1111, buttons1111[0]);

		if (scorer == 0) {
			team1.scorer = 3;
			team2.scorer = 0;
		} else if (scorer == 1) {
			team1.scorer = 0;
			team2.scorer = 5;
		} else if (scorer == 2) {
			team1.scorer = 3;
			team2.scorer = 3;
		} else if (scorer == 3) {
			team1.scorer = 0;
			team2.scorer = 0;
		}
		team1.score = team1.home + team1.injury + team1.recent + team1.ranking + team1.supervisor + team1.ability
				+ team1.scorer + team1.finalranking;
		team2.score = team2.home + team2.injury + team2.recent + team2.ranking + team2.supervisor + team2.ability
				+ team2.scorer + team2.finalranking;
		team1.total = (double) team1.score / (team1.score + team2.score) * 100;
		JOptionPane.showMessageDialog(null, team1.name + "이(가) 이길 확률은 " + team1.total + "% 입니다.");
	}
}