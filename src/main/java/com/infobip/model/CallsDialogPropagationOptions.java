/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Represents CallsDialogPropagationOptions model.
 */
public class CallsDialogPropagationOptions {

    private Boolean childCallHangup;

    /**
     * Sets childCallHangup.
     * <p>
     * Field description:
     * Flag indicating if the parent call should be terminated when the child call ends.
     *
     * @param childCallHangup
     * @return This {@link CallsDialogPropagationOptions instance}.
     */
    public CallsDialogPropagationOptions childCallHangup(Boolean childCallHangup) {
        this.childCallHangup = childCallHangup;
        return this;
    }

    /**
     * Returns childCallHangup.
     * <p>
     * Field description:
     * Flag indicating if the parent call should be terminated when the child call ends.
     *
     * @return childCallHangup
     */
    @JsonProperty("childCallHangup")
    public Boolean getChildCallHangup() {
        return childCallHangup;
    }

    /**
     * Sets childCallHangup.
     * <p>
     * Field description:
     * Flag indicating if the parent call should be terminated when the child call ends.
     *
     * @param childCallHangup
     */
    @JsonProperty("childCallHangup")
    public void setChildCallHangup(Boolean childCallHangup) {
        this.childCallHangup = childCallHangup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsDialogPropagationOptions callsDialogPropagationOptions = (CallsDialogPropagationOptions) o;
        return Objects.equals(this.childCallHangup, callsDialogPropagationOptions.childCallHangup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childCallHangup);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialogPropagationOptions {")
                .append(newLine)
                .append("    childCallHangup: ")
                .append(toIndentedString(childCallHangup))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
