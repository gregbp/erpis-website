
package dbtest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dbtest package. 
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

    private final static QName _SetIdResponse_QNAME = new QName("http://dbTest/", "setIdResponse");
    private final static QName _GetDescription_QNAME = new QName("http://dbTest/", "getDescription");
    private final static QName _GetPlace_QNAME = new QName("http://dbTest/", "getPlace");
    private final static QName _SetPlaceResponse_QNAME = new QName("http://dbTest/", "setPlaceResponse");
    private final static QName _SetNameResponse_QNAME = new QName("http://dbTest/", "setNameResponse");
    private final static QName _GetIdResponse_QNAME = new QName("http://dbTest/", "getIdResponse");
    private final static QName _GetNameResponse_QNAME = new QName("http://dbTest/", "getNameResponse");
    private final static QName _GetDescriptionResponse_QNAME = new QName("http://dbTest/", "getDescriptionResponse");
    private final static QName _GetName_QNAME = new QName("http://dbTest/", "getName");
    private final static QName _SetDescription_QNAME = new QName("http://dbTest/", "setDescription");
    private final static QName _GetDateResponse_QNAME = new QName("http://dbTest/", "getDateResponse");
    private final static QName _GetDate_QNAME = new QName("http://dbTest/", "getDate");
    private final static QName _SetDate_QNAME = new QName("http://dbTest/", "setDate");
    private final static QName _SetDateResponse_QNAME = new QName("http://dbTest/", "setDateResponse");
    private final static QName _GetId_QNAME = new QName("http://dbTest/", "getId");
    private final static QName _SetDescriptionResponse_QNAME = new QName("http://dbTest/", "setDescriptionResponse");
    private final static QName _SetId_QNAME = new QName("http://dbTest/", "setId");
    private final static QName _GetPlaceResponse_QNAME = new QName("http://dbTest/", "getPlaceResponse");
    private final static QName _SetName_QNAME = new QName("http://dbTest/", "setName");
    private final static QName _SetPlace_QNAME = new QName("http://dbTest/", "setPlace");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dbtest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetPlace }
     * 
     */
    public SetPlace createSetPlace() {
        return new SetPlace();
    }

    /**
     * Create an instance of {@link GetIdResponse }
     * 
     */
    public GetIdResponse createGetIdResponse() {
        return new GetIdResponse();
    }

    /**
     * Create an instance of {@link GetPlace }
     * 
     */
    public GetPlace createGetPlace() {
        return new GetPlace();
    }

    /**
     * Create an instance of {@link GetDescription }
     * 
     */
    public GetDescription createGetDescription() {
        return new GetDescription();
    }

    /**
     * Create an instance of {@link GetPlaceResponse }
     * 
     */
    public GetPlaceResponse createGetPlaceResponse() {
        return new GetPlaceResponse();
    }

    /**
     * Create an instance of {@link SetName }
     * 
     */
    public SetName createSetName() {
        return new SetName();
    }

    /**
     * Create an instance of {@link GetDateResponse }
     * 
     */
    public GetDateResponse createGetDateResponse() {
        return new GetDateResponse();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link GetId }
     * 
     */
    public GetId createGetId() {
        return new GetId();
    }

    /**
     * Create an instance of {@link SetNameResponse }
     * 
     */
    public SetNameResponse createSetNameResponse() {
        return new SetNameResponse();
    }

    /**
     * Create an instance of {@link SetPlaceResponse }
     * 
     */
    public SetPlaceResponse createSetPlaceResponse() {
        return new SetPlaceResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link SetDate }
     * 
     */
    public SetDate createSetDate() {
        return new SetDate();
    }

    /**
     * Create an instance of {@link SetDateResponse }
     * 
     */
    public SetDateResponse createSetDateResponse() {
        return new SetDateResponse();
    }

    /**
     * Create an instance of {@link GetDescriptionResponse }
     * 
     */
    public GetDescriptionResponse createGetDescriptionResponse() {
        return new GetDescriptionResponse();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link SetDescriptionResponse }
     * 
     */
    public SetDescriptionResponse createSetDescriptionResponse() {
        return new SetDescriptionResponse();
    }

    /**
     * Create an instance of {@link SetId }
     * 
     */
    public SetId createSetId() {
        return new SetId();
    }

    /**
     * Create an instance of {@link SetIdResponse }
     * 
     */
    public SetIdResponse createSetIdResponse() {
        return new SetIdResponse();
    }

    /**
     * Create an instance of {@link SetDescription }
     * 
     */
    public SetDescription createSetDescription() {
        return new SetDescription();
    }

    /**
     * Create an instance of {@link GetDate }
     * 
     */
    public GetDate createGetDate() {
        return new GetDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setIdResponse")
    public JAXBElement<SetIdResponse> createSetIdResponse(SetIdResponse value) {
        return new JAXBElement<SetIdResponse>(_SetIdResponse_QNAME, SetIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getDescription")
    public JAXBElement<GetDescription> createGetDescription(GetDescription value) {
        return new JAXBElement<GetDescription>(_GetDescription_QNAME, GetDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getPlace")
    public JAXBElement<GetPlace> createGetPlace(GetPlace value) {
        return new JAXBElement<GetPlace>(_GetPlace_QNAME, GetPlace.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setPlaceResponse")
    public JAXBElement<SetPlaceResponse> createSetPlaceResponse(SetPlaceResponse value) {
        return new JAXBElement<SetPlaceResponse>(_SetPlaceResponse_QNAME, SetPlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setNameResponse")
    public JAXBElement<SetNameResponse> createSetNameResponse(SetNameResponse value) {
        return new JAXBElement<SetNameResponse>(_SetNameResponse_QNAME, SetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getIdResponse")
    public JAXBElement<GetIdResponse> createGetIdResponse(GetIdResponse value) {
        return new JAXBElement<GetIdResponse>(_GetIdResponse_QNAME, GetIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<GetNameResponse>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getDescriptionResponse")
    public JAXBElement<GetDescriptionResponse> createGetDescriptionResponse(GetDescriptionResponse value) {
        return new JAXBElement<GetDescriptionResponse>(_GetDescriptionResponse_QNAME, GetDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<GetName>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setDescription")
    public JAXBElement<SetDescription> createSetDescription(SetDescription value) {
        return new JAXBElement<SetDescription>(_SetDescription_QNAME, SetDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getDateResponse")
    public JAXBElement<GetDateResponse> createGetDateResponse(GetDateResponse value) {
        return new JAXBElement<GetDateResponse>(_GetDateResponse_QNAME, GetDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getDate")
    public JAXBElement<GetDate> createGetDate(GetDate value) {
        return new JAXBElement<GetDate>(_GetDate_QNAME, GetDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setDate")
    public JAXBElement<SetDate> createSetDate(SetDate value) {
        return new JAXBElement<SetDate>(_SetDate_QNAME, SetDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setDateResponse")
    public JAXBElement<SetDateResponse> createSetDateResponse(SetDateResponse value) {
        return new JAXBElement<SetDateResponse>(_SetDateResponse_QNAME, SetDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getId")
    public JAXBElement<GetId> createGetId(GetId value) {
        return new JAXBElement<GetId>(_GetId_QNAME, GetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDescriptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setDescriptionResponse")
    public JAXBElement<SetDescriptionResponse> createSetDescriptionResponse(SetDescriptionResponse value) {
        return new JAXBElement<SetDescriptionResponse>(_SetDescriptionResponse_QNAME, SetDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setId")
    public JAXBElement<SetId> createSetId(SetId value) {
        return new JAXBElement<SetId>(_SetId_QNAME, SetId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlaceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "getPlaceResponse")
    public JAXBElement<GetPlaceResponse> createGetPlaceResponse(GetPlaceResponse value) {
        return new JAXBElement<GetPlaceResponse>(_GetPlaceResponse_QNAME, GetPlaceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setName")
    public JAXBElement<SetName> createSetName(SetName value) {
        return new JAXBElement<SetName>(_SetName_QNAME, SetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPlace }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dbTest/", name = "setPlace")
    public JAXBElement<SetPlace> createSetPlace(SetPlace value) {
        return new JAXBElement<SetPlace>(_SetPlace_QNAME, SetPlace.class, null, value);
    }

}
