package baseball.view;

public class OutputView {
    private static final String SUCCESS_MESSAGE="3개의 숫자를 모두 맞히셨습니다! 게임 종료";

    public void showMessage(String message){
        System.out.println(message);
    }
    public void showSuccessMessage(){
        System.out.println(SUCCESS_MESSAGE);
    }
}
