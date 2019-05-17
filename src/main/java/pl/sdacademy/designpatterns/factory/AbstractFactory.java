package pl.sdacademy.designpatterns.factory;

public interface AbstractFactory<T> {
  T create(String type);
}
