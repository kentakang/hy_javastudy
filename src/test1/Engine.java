package test1;

public class Engine {

    int maxSpeed;
    int zeroBack;

    public Engine(int maxSpeed, int zeroBack) {
        this.maxSpeed = maxSpeed;
        this.zeroBack = zeroBack;
    }

    public String info() {
        return "엔진 정보 입니다.\n" + "최대 속도 : " + maxSpeed + "km/h\n제로백 : " + zeroBack;
    }
}
