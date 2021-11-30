package Programmers.Level2;

public class 방금그곡 {

    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxPlayTime = -1;
        m = changeMelody(m);

        for(String muscinfo : musicinfos){
            String[] info = muscinfo.split(",");
            String title = info[2];
            String melodyInfo = changeMelody(info[3]);
            String[] timeInfo = info[0].split(":");
            //시작 시간 분단위로 변환
            int start = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);
            int end = 0;

            timeInfo = info[1].split(":");
            end = Integer.valueOf(timeInfo[0]) * 60 + Integer.valueOf(timeInfo[1]);

            int play = end - start;

            if(play > melodyInfo.length()){
                StringBuilder newMelody = new StringBuilder();

                for(int i=0; i < play / melodyInfo.length(); i++){
                    newMelody.append(melodyInfo);
                }
                newMelody.append(melodyInfo.substring(0, play % melodyInfo.length()));
                melodyInfo = newMelody.toString();
            }else{
                melodyInfo = melodyInfo.substring(0, play);
            }

            if(melodyInfo.contains(m) && play > maxPlayTime){
                answer = title;
                maxPlayTime = play;
            }
        }


        return maxPlayTime != -1 ? answer : "(None)";
    }

    String changeMelody(String oldMelody){
        oldMelody = oldMelody.replaceAll("C#", "H");
        oldMelody = oldMelody.replaceAll("D#", "I");
        oldMelody = oldMelody.replaceAll("F#", "J");
        oldMelody = oldMelody.replaceAll("G#", "K");
        oldMelody = oldMelody.replaceAll("A#", "L");

        return oldMelody;
    }
}
