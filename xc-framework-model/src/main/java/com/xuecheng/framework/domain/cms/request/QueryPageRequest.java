package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import lombok.Data;

/**
 * @author Eric Lee
 * @date 2019/11/22 14:41
 */
@Data
public class QueryPageRequest extends RequestData {
    private String siteId;

    private String pageId;

    private String pageName;

    private String pageAliase;

    private String templateId;


}
