package com.bms.order.constant.enumeration;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * 买手退货申请人身份
 * 
 * @author li_huiqian
 *
 */
public enum BsApplyUserType {

	SA("001", "Sa", "管家"),
	PLATFORM_STAFF("002", "Platform Staff", "平台订单员");

    private String code;

    private String enDesc;
    
    private String cnDesc;

    private BsApplyUserType (String code, String enDesc, String cnDesc) {
        this.code = code;
        this.enDesc = enDesc;
        this.cnDesc = cnDesc;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
    	Locale locale = Locale.getDefault();
        return getName(locale);
    }
    
    public String getName(Locale locale) {
    	if (locale == Locale.SIMPLIFIED_CHINESE)
    		return cnDesc;
    	else 
    		return enDesc;
    }

    public static BsApplyUserType getInstance(String code) {
        for (BsApplyUserType item : values()) {
            if (item.code.equals(code))
                return item;
        }
        return null;
    }

    public static Map<String, String> getMap(BsApplyUserType [] values) {
        if (values == null)
            return null;

        Map<String, String> map = new HashMap<>();
        for (BsApplyUserType value : values) {
            map.put(value.getCode(), value.getName());
        }
        return map;
    }

    public static Map<String, String> getMap() {
        return getMap(BsApplyUserType.values());
    }

}
