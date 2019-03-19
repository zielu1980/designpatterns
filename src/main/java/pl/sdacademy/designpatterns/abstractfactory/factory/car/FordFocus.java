package pl.sdacademy.designpatterns.abstractfactory.factory.car;

class FordFocus implements Car {

    private EngineType type;
    private Double engineVolume;
    private int cylinderNum;

    public FordFocus(final EngineType type, final Double engineVolume, final int cylinderNum) {
        this.type = type;
        this.engineVolume = engineVolume;
        this.cylinderNum = cylinderNum;
    }

    @Override
    public String getModelName() {
        return "Focus";
    }

    @Override
    public EngineType getType() {
        return type;
    }

    @Override
    public Double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public int getCylidersNum() {
        return cylinderNum;
    }
}
