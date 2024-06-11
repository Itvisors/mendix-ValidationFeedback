import "./ui/ValidationFeedback.css";
import { Alert } from "./components/Alert";
import { createElement } from "react";

export function ValidationFeedback({
    attribute,
    association,
    alertStyle,
    horizontalIndentation,
    indentationWidth,
    class: classNameInput,
    style: styleInput
}) {
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
    const style = alertStyle ? (alertStyle.value ? alertStyle.value.toLowerCase() : "") : "";
    const className =
        "custom-validation-widget " +
        (horizontalIndentation ? `col-sm-${12 - indentationWidth} ` : "") +
        (classNameInput ? classNameInput : "");

    const validationContent = (
        <div className={className} style={styleInput}>
            <Alert alertStyle={style}>{validationFeedbackAttribute}</Alert>
            <Alert alertStyle={style}>{validationFeedbackAssociation}</Alert>
        </div>
    );

    return validationFeedbackAttribute || validationFeedbackAssociation ? (
        <div>
            {horizontalIndentation ? (
                <div className="row">
                    <div className={`col-sm-${indentationWidth}`}></div>
                    {validationContent}
                </div>
            ) : (
                validationContent
            )}
        </div>
    ) : undefined;
}
