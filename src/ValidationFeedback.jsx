import { createElement } from "react";

import { Alert } from "./components/Alert";
import "./ui/ValidationFeedback.css";

export function ValidationFeedback({ attribute, association, alertStyle, class: classNameInput, style: styleInput }) {
    // initialize validationFeedback, which can be either undefined or a string
    let validationFeedbackAttribute;
    let validationFeedbackAssociation;
    // Check whether there is a validation message set for the attribute or association used
    if (attribute && typeof attribute.validation !== "undefined") {
        validationFeedbackAttribute = attribute.validation;
    }
    if (association && typeof association.validation !== "undefined") {
        validationFeedbackAssociation = association.validation;
    }
    let style = alertStyle ? alertStyle.value : undefined;
    let className = "custom-validation-widget " + (classNameInput ? classNameInput : "");
    return validationFeedbackAttribute || validationFeedbackAssociation ? (
        <div className={className} style={styleInput}>
            <Alert alertStyle={style}>{validationFeedbackAttribute}</Alert>
            <Alert alertStyle={style}>{validationFeedbackAssociation}</Alert>
        </div>
    ) : undefined;
}
