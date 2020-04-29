/**
 * SSNCheckerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicestub;

public class SSNCheckerServiceLocator extends org.apache.axis.client.Service implements servicestub.SSNCheckerService {

    public SSNCheckerServiceLocator() {
    }


    public SSNCheckerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SSNCheckerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SSNChecker
    private java.lang.String SSNChecker_address = "http://localhost:8080/AXISServer_war_exploded/services/SSNChecker";

    public java.lang.String getSSNCheckerAddress() {
        return SSNChecker_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SSNCheckerWSDDServiceName = "SSNChecker";

    public java.lang.String getSSNCheckerWSDDServiceName() {
        return SSNCheckerWSDDServiceName;
    }

    public void setSSNCheckerWSDDServiceName(java.lang.String name) {
        SSNCheckerWSDDServiceName = name;
    }

    public servicestub.SSNChecker_PortType getSSNChecker() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SSNChecker_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSSNChecker(endpoint);
    }

    public servicestub.SSNChecker_PortType getSSNChecker(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicestub.SSNCheckerSoapBindingStub _stub = new servicestub.SSNCheckerSoapBindingStub(portAddress, this);
            _stub.setPortName(getSSNCheckerWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSSNCheckerEndpointAddress(java.lang.String address) {
        SSNChecker_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicestub.SSNChecker_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                servicestub.SSNCheckerSoapBindingStub _stub = new servicestub.SSNCheckerSoapBindingStub(new java.net.URL(SSNChecker_address), this);
                _stub.setPortName(getSSNCheckerWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SSNChecker".equals(inputPortName)) {
            return getSSNChecker();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.axisserver.jydet.fr.jydet.fr", "SSNCheckerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.axisserver.jydet.fr.jydet.fr", "SSNChecker"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SSNChecker".equals(portName)) {
            setSSNCheckerEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
