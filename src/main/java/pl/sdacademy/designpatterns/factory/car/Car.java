package pl.sdacademy.designpatterns.factory.car;

public interface Car {
  String getModelName();
  EngineType getType();
  Double getEngineVolume();
  int getCylindersNum();
  BodyType getBodyType();
}
