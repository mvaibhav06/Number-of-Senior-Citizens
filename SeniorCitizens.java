class SeniorCitizens {
    public int countSeniors(String[] details) {
        int out = 0;

        for(int i=0; i<details.length; i++){
            String s = details[i].substring(11,13);
            int age = Integer.parseInt(s);
            if(age > 60){
                out++;
            }
        }
        return out;
    }
}
