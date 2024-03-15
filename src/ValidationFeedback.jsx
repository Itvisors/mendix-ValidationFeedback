import { createElement } from "react";

import { HelloWorldSample } from "./components/HelloWorldSample";
import "./ui/ValidationFeedback.css";

export function ValidationFeedback({ sampleText }) {
    return <HelloWorldSample sampleText={sampleText} />;
}
