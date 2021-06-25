package Programmers.Level2;

public class 스킬트리 {
    public int solution(String skill,String[] skill_trees){
        int answer = 0;
        for (String x : skill_trees) {
            String tempSkill = x;

            for (int i = 0; i < x.length(); i++) {
                String s = x.substring(i, i+1);
                if (!skill.contains(s)) {
                    tempSkill = tempSkill.replace(s, "");
                }
            }

            if (skill.indexOf(tempSkill) == 0)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args){

        스킬트리 T = new 스킬트리();
        String skill = "CBD";
        String[] arr = {"BACDE", "CBADF", "AECB","CDB"};
        System.out.print(T.solution(skill, arr));
    }
}
