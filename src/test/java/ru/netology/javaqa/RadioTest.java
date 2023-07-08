package ru.netology.javaqa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class RadioTest {


    @Test
    public void nextCurrentStationTestNormalStation(){ // Использование не параметризованного конструктора Radio
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.nextCurrentStation();
        assertEquals(5,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation(){ // Использование не параметризованного конструктора Radio
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        radio.nextCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation(){ // Использование параметризованного конструктора Radio
        Radio radio = new Radio(10);
        radio.setCurrentStation(4);
        radio.prevCurrentStation();
        assertEquals(3,radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation(){ // Использование параметризованного конструктора Radio
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(4);
        assertEquals(4,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(10);
        assertEquals(10,radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUnderMinStation(){
        Radio radio = new Radio(10);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        assertEquals(0,radio.getCurrentStation());
    }

    @Test
    public void nextCurrentVolumeTestNormalVolume(){
        Radio radio = new Radio(100, 0, 40);
        radio.nextCurrentVolume();
        assertEquals(41,radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume(){
        Radio radio = new Radio(100, 0, 100);
        radio.nextCurrentVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume(){
        Radio radio = new Radio(100, 0, 40);
        radio.setCurrentVolume(40);
        radio.prevCurrentVolume();
        assertEquals(39,radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume(){
        Radio radio = new Radio(100, 0, 0);
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setMaxStationTest(){
        Radio radio = new Radio(10, 0, 0);
        radio.setMaxStation(10);
        assertEquals(10,radio.getMaxStation());
    }

    @Test
    public void setMinStationTest(){
        Radio radio = new Radio(100, 0, 0);
        radio.setMinStation(0);
        assertEquals(0,radio.getMinStation());
    }

    @Test
    public void setCurrentStationTestOverMaxStation(){
        Radio radio = new Radio(100, 0, 8);
        radio.setCurrentStation(60);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation(){
        Radio radio = new Radio(100, 0, 8);
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void setMaxVolumeTest(){
        Radio radio = new Radio(100, 0, 0);
        assertEquals(100,radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest(){
        Radio radio = new Radio(100, 0, 0);
        radio.setMinVolume(0);
        assertEquals(0,radio.getMinVolume());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume(){
        Radio radio = new Radio(100, 0, 70);
        radio.setCurrentVolume(600);
        assertEquals(70, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume(){
        Radio radio = new Radio(100, 0, -10);
        radio.setCurrentVolume(-10);
        assertEquals(-10, radio.getCurrentVolume());
    }

}