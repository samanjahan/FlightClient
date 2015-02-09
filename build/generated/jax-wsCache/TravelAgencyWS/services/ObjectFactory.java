
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckFlight_QNAME = new QName("http://travel.hw2.services.web/", "checkFlight");
    private final static QName _CheckFlightResponse_QNAME = new QName("http://travel.hw2.services.web/", "checkFlightResponse");
    private final static QName _Reserve_QNAME = new QName("http://travel.hw2.services.web/", "reserve");
    private final static QName _ReserveResponse_QNAME = new QName("http://travel.hw2.services.web/", "reserveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckFlight }
     * 
     */
    public CheckFlight createCheckFlight() {
        return new CheckFlight();
    }

    /**
     * Create an instance of {@link Reserve }
     * 
     */
    public Reserve createReserve() {
        return new Reserve();
    }

    /**
     * Create an instance of {@link CheckFlightResponse }
     * 
     */
    public CheckFlightResponse createCheckFlightResponse() {
        return new CheckFlightResponse();
    }

    /**
     * Create an instance of {@link ReserveResponse }
     * 
     */
    public ReserveResponse createReserveResponse() {
        return new ReserveResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travel.hw2.services.web/", name = "checkFlight")
    public JAXBElement<CheckFlight> createCheckFlight(CheckFlight value) {
        return new JAXBElement<CheckFlight>(_CheckFlight_QNAME, CheckFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travel.hw2.services.web/", name = "checkFlightResponse")
    public JAXBElement<CheckFlightResponse> createCheckFlightResponse(CheckFlightResponse value) {
        return new JAXBElement<CheckFlightResponse>(_CheckFlightResponse_QNAME, CheckFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Reserve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travel.hw2.services.web/", name = "reserve")
    public JAXBElement<Reserve> createReserve(Reserve value) {
        return new JAXBElement<Reserve>(_Reserve_QNAME, Reserve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://travel.hw2.services.web/", name = "reserveResponse")
    public JAXBElement<ReserveResponse> createReserveResponse(ReserveResponse value) {
        return new JAXBElement<ReserveResponse>(_ReserveResponse_QNAME, ReserveResponse.class, null, value);
    }

}
