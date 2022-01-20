/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** WhatsAppSingleMessageStatus */
public class WhatsAppSingleMessageStatus {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";

  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_GROUP_NAME = "groupName";

  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_ID = "id";

  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";

  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";

  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ACTION = "action";

  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public WhatsAppSingleMessageStatus groupId(Integer groupId) {

    this.groupId = groupId;
    return this;
  }

  /**
   * Status group ID.
   *
   * @return groupId
   */
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public WhatsAppSingleMessageStatus groupName(String groupName) {

    this.groupName = groupName;
    return this;
  }

  /**
   * Status group name.
   *
   * @return groupName
   */
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public WhatsAppSingleMessageStatus id(Integer id) {

    this.id = id;
    return this;
  }

  /**
   * Status ID.
   *
   * @return id
   */
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public WhatsAppSingleMessageStatus name(String name) {

    this.name = name;
    return this;
  }

  /**
   * Status name.
   *
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WhatsAppSingleMessageStatus description(String description) {

    this.description = description;
    return this;
  }

  /**
   * Human-readable description of the status.
   *
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WhatsAppSingleMessageStatus action(String action) {

    this.action = action;
    return this;
  }

  /**
   * Action that should be taken to eliminate the error.
   *
   * @return action
   */
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = (WhatsAppSingleMessageStatus) o;
    return Objects.equals(this.groupId, whatsAppSingleMessageStatus.groupId)
        && Objects.equals(this.groupName, whatsAppSingleMessageStatus.groupName)
        && Objects.equals(this.id, whatsAppSingleMessageStatus.id)
        && Objects.equals(this.name, whatsAppSingleMessageStatus.name)
        && Objects.equals(this.description, whatsAppSingleMessageStatus.description)
        && Objects.equals(this.action, whatsAppSingleMessageStatus.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, groupName, id, name, description, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppSingleMessageStatus {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}