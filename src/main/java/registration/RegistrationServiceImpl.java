package registration;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(style = SOAPBinding.Style.RPC)
@WebService(targetNamespace = "http://localhost", endpointInterface = "registration.RegistrationService")
public class RegistrationServiceImpl implements RegistrationService {

    @WebMethod
    public String registerUser(String username) {
        return "password";
    }

}