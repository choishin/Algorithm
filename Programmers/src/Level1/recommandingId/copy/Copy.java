package Level1.recommandingId.copy;

class Copy {
    public String solution(String new_id) {
        String answer = "";

        //1단계
        answer = new_id.toLowerCase();

        //2단계
        answer = answer.replaceAll("[^0-9a-z-_.]", "");

        //3단계
        answer = answer.replaceAll("[.]{2,}", ".");

        //4단계
        answer = answer.replaceAll("^[.]", "");
        answer = answer.replaceAll("[.]$", "");

        //5단계
        if(answer.length() == 0){
            answer = "a";
        }

        //6단계
        if(new_id.length() > 15){
            answer = answer.substring(0, 15).replaceAll("[.]$","");
        }

        //7단계
        if(answer.length() <= 2){            
            while(answer.length() != 3){
                answer += answer.substring(answer.length()-1);                
            }
        }

        return answer;
    }
}
