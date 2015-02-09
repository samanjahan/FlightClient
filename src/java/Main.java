/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author syst3m
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("checkFlight " + checkFlight("stockholm", "goteborg"));
        System.out.println("reserve " + reserve(1));
    }

    private static java.util.List<java.lang.String> checkFlight(java.lang.String departure, java.lang.String destination) {
        services.FlightCheckerWS service = new services.FlightCheckerWS();
        services.TravelAgencyWS port = service.getTravelAgencyWSPort();
        return port.checkFlight(departure, destination);
    }

    private static boolean reserve(int trip) {
        services.FlightCheckerWS service = new services.FlightCheckerWS();
        services.TravelAgencyWS port = service.getTravelAgencyWSPort();
        return port.reserve(trip);
    }  
}
