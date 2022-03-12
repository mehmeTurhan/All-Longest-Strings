String[] solution(String[] inputArray) {
    int max = inputArray[0].length();
    for (int i = 1; i < inputArray.length; i++) {
      if (inputArray[i].length() > max) {
        max = inputArray[i].length();
      }
    }
    int count = 0;
    for (String s : inputArray) {
      if (s.length() == max) {
        count++;
      }
    }
    int j=0;
    String[] output = new String[count];
    for(int i=0;i<inputArray.length;i++){
        if(inputArray[i].length()==max){
            output[j]=inputArray[i];
            j++;
        }
    }
    return output;
}
