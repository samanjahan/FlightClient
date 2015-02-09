
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FlightCheckerWS", targetNamespace = "http://travel.hw2.services.web/", wsdlLocation = "http://localhost:8080/FlightCheckerWS/TravelAgencyWS?wsdl")
public class FlightCheckerWS
    extends Service
{

    private final static URL FLIGHTCHECKERWS_WSDL_LOCATION;
    private final static WebServiceException FLIGHTCHECKERWS_EXCEPTION;
    private final static QName FLIGHTCHECKERWS_QNAME = new QName("http://travel.hw2.services.web/", "FlightCheckerWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/FlightCheckerWS/TravelAgencyWS?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FLIGHTCHECKERWS_WSDL_LOCATION = url;
        FLIGHTCHECKERWS_EXCEPTION = e;
    }

    public FlightCheckerWS() {
        super(__getWsdlLocation(), FLIGHTCHECKERWS_QNAME);
    }

    public FlightCheckerWS(WebServiceFeature... features) {
        super(__getWsdlLocation(), FLIGHTCHECKERWS_QNAME, features);
    }

    public FlightCheckerWS(URL wsdlLocation) {
        super(wsdlLocation, FLIGHTCHECKERWS_QNAME);
    }

    public FlightCheckerWS(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FLIGHTCHECKERWS_QNAME, features);
    }

    public FlightCheckerWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FlightCheckerWS(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TravelAgencyWS
     */
    @WebEndpoint(name = "TravelAgencyWSPort")
    public TravelAgencyWS getTravelAgencyWSPort() {
        return super.getPort(new QName("http://travel.hw2.services.web/", "TravelAgencyWSPort"), TravelAgencyWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TravelAgencyWS
     */
    @WebEndpoint(name = "TravelAgencyWSPort")
    public TravelAgencyWS getTravelAgencyWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://travel.hw2.services.web/", "TravelAgencyWSPort"), TravelAgencyWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FLIGHTCHECKERWS_EXCEPTION!= null) {
            throw FLIGHTCHECKERWS_EXCEPTION;
        }
        return FLIGHTCHECKERWS_WSDL_LOCATION;
    }

}