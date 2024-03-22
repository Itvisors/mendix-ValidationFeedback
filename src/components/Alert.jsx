import classNames from "classnames";
import { createElement } from "react";

/**
 * alertStyle = "default" | "primary" | "success" | "info" | "warning" | "danger"
 * className = custom className to be added
 * children = content to show within alert
 */
export const Alert = ({ alertStyle = "danger", className, children }) => {
    let alertClass;
    if (
        alertStyle === "default" ||
        alertStyle === "primary" ||
        alertStyle === "success" ||
        alertStyle === "info" ||
        alertStyle === "warning" ||
        alertStyle === "danger"
    ) {
        alertClass = "alert-" + alertStyle;
    } else {
        alertClass = "alert-danger";
    }
    return children ? (
        <div className={classNames(`alert ${alertClass} mx-validation-message`, className)}>{children}</div>
    ) : null;
};
