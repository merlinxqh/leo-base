package com.leo.model;

import com.leo.base.entity.BaseEntity;

/**
 * 
 * @author ffzx
 * @date 2017-02-26 19:07:12
 * @version 1.0.0
 * @copyright www.ffzxnet.com
 */
public class TResource extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * code.
     */
    private String code;

    /**
     * 资源名称.
     */
    private String name;

    /**
     * 资源路径.
     */
    private String url;

    /**
     * 资源类型.
     */
    private Integer resourceType;

    /**
     * 上级.
     */
    private String parentCode;

    /**
     * 样式.
     */
    private String iconClass;

    /**
     * 
     * {@linkplain #code}
     *
     * @return the value of t_resource.code
     */
    public String getCode() {
        return code;
    }

    /**
     * {@linkplain #code}
     * @param code the value for t_resource.code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 
     * {@linkplain #name}
     *
     * @return the value of t_resource.name
     */
    public String getName() {
        return name;
    }

    /**
     * {@linkplain #name}
     * @param name the value for t_resource.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * {@linkplain #url}
     *
     * @return the value of t_resource.url
     */
    public String getUrl() {
        return url;
    }

    /**
     * {@linkplain #url}
     * @param url the value for t_resource.url
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 
     * {@linkplain #resourceType}
     *
     * @return the value of t_resource.resource_type
     */
    public Integer getResourceType() {
        return resourceType;
    }

    /**
     * {@linkplain #resourceType}
     * @param resourceType the value for t_resource.resource_type
     */
    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * 
     * {@linkplain #parentCode}
     *
     * @return the value of t_resource.parent_code
     */
    public String getParentCode() {
        return parentCode;
    }

    /**
     * {@linkplain #parentCode}
     * @param parentCode the value for t_resource.parent_code
     */
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    /**
     * 
     * {@linkplain #iconClass}
     *
     * @return the value of t_resource.icon_class
     */
    public String getIconClass() {
        return iconClass;
    }

    /**
     * {@linkplain #iconClass}
     * @param iconClass the value for t_resource.icon_class
     */
    public void setIconClass(String iconClass) {
        this.iconClass = iconClass == null ? null : iconClass.trim();
    }
}