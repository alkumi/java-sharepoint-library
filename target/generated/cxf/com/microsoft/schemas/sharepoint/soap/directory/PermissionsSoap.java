package com.microsoft.schemas.sharepoint.soap.directory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:10.769+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", name = "PermissionsSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface PermissionsSoap {

    @RequestWrapper(localName = "AddPermissionCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.AddPermissionCollection")
    @WebMethod(operationName = "AddPermissionCollection", action = "http://schemas.microsoft.com/sharepoint/soap/directory/AddPermissionCollection")
    @ResponseWrapper(localName = "AddPermissionCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.AddPermissionCollectionResponse")
    public void addPermissionCollection(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType,
        @WebParam(name = "permissionsInfoXml", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        com.microsoft.schemas.sharepoint.soap.directory.AddPermissionCollection.PermissionsInfoXml permissionsInfoXml
    );

    @RequestWrapper(localName = "RemovePermission", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.RemovePermission")
    @WebMethod(operationName = "RemovePermission", action = "http://schemas.microsoft.com/sharepoint/soap/directory/RemovePermission")
    @ResponseWrapper(localName = "RemovePermissionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.RemovePermissionResponse")
    public void removePermission(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType,
        @WebParam(name = "permissionIdentifier", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionIdentifier,
        @WebParam(name = "permissionType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionType
    );

    @RequestWrapper(localName = "RemovePermissionCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.RemovePermissionCollection")
    @WebMethod(operationName = "RemovePermissionCollection", action = "http://schemas.microsoft.com/sharepoint/soap/directory/RemovePermissionCollection")
    @ResponseWrapper(localName = "RemovePermissionCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.RemovePermissionCollectionResponse")
    public void removePermissionCollection(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType,
        @WebParam(name = "memberIdsXml", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        com.microsoft.schemas.sharepoint.soap.directory.RemovePermissionCollection.MemberIdsXml memberIdsXml
    );

    @RequestWrapper(localName = "AddPermission", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.AddPermission")
    @WebMethod(operationName = "AddPermission", action = "http://schemas.microsoft.com/sharepoint/soap/directory/AddPermission")
    @ResponseWrapper(localName = "AddPermissionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.AddPermissionResponse")
    public void addPermission(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType,
        @WebParam(name = "permissionIdentifier", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionIdentifier,
        @WebParam(name = "permissionType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionType,
        @WebParam(name = "permissionMask", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        int permissionMask
    );

    @RequestWrapper(localName = "UpdatePermission", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.UpdatePermission")
    @WebMethod(operationName = "UpdatePermission", action = "http://schemas.microsoft.com/sharepoint/soap/directory/UpdatePermission")
    @ResponseWrapper(localName = "UpdatePermissionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.UpdatePermissionResponse")
    public void updatePermission(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType,
        @WebParam(name = "permissionIdentifier", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionIdentifier,
        @WebParam(name = "permissionType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String permissionType,
        @WebParam(name = "permissionMask", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        int permissionMask
    );

    @WebResult(name = "GetPermissionCollectionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
    @RequestWrapper(localName = "GetPermissionCollection", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.GetPermissionCollection")
    @WebMethod(operationName = "GetPermissionCollection", action = "http://schemas.microsoft.com/sharepoint/soap/directory/GetPermissionCollection")
    @ResponseWrapper(localName = "GetPermissionCollectionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", className = "com.microsoft.schemas.sharepoint.soap.directory.GetPermissionCollectionResponse")
    public com.microsoft.schemas.sharepoint.soap.directory.GetPermissionCollectionResponse.GetPermissionCollectionResult getPermissionCollection(
        @WebParam(name = "objectName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectName,
        @WebParam(name = "objectType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/")
        java.lang.String objectType
    );
}