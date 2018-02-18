package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTestSuite {
    @Test
    public void testCalcuateForecastWithMock() {
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);

        HashMap<Integer,Double> temperaturesMap = new HashMap<Integer,Double>();
        temperaturesMap.put(0,25.6);
        temperaturesMap.put(1,32.1);
        temperaturesMap.put(2,12.1);
        temperaturesMap.put(3,23.1);
        temperaturesMap.put(4,24.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}
