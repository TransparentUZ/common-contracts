package uz.powercorp.common;


import uz.powercorp.common.data.enums.Role;

import java.util.List;

public class UserContext {
    public static final ThreadLocal<List<Role>> userRole = new ThreadLocal<>();
    public static final ThreadLocal<String> userToken = new ThreadLocal<>(); //be careful with this token, it can be User token or Agent token, it is  not always Agent Token
    public static final ThreadLocal<Long> userId = new ThreadLocal<>(); //be careful with this token, it can be User id or Agent id, it is  not always Agent id
    public static final  ThreadLocal<Double> agenCommission = new ThreadLocal<>();
    public  static final  ThreadLocal<Long> agentId = new ThreadLocal<>();

    public static void userRole(List<Role> roles) {
        userRole.set(roles);
    }
    public static List<Role> getRoles() {
        return userRole.get();
    }
    public static void setUserToken(String token) {
        userToken.set(token);
    }
    public static String getUserToken() {
        return userToken.get();
    }
    public static void setUserId(Long id) {userId.set(id);}
    public static Long getUserId() {return userId.get();}

    public static void setAgentCommission(Double commission) {
        agenCommission.set(commission);
    }
    public static Double getAgentCommission() {
        return agenCommission.get();
    }

    public static void setAgentId(Long id) {
        agentId.set(id);
    }
    public static Long getAgentId() {
        return agentId.get();
    }

    public static void clear() {
        userToken.remove();
    }
}
