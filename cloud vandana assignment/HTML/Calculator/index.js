let displayValue = "0";

function display(value) {
    if (displayValue === "0") {
        displayValue = value;
    } else {
        displayValue += value;
    }
    onChange();
}
function result() {
    try {
        displayValue = eval(displayValue).toString();
    } catch (error) {
        displayValue = "Error";
    }
    onChange();
}
function clearVal() {
    displayValue = "0";
    onChange();
}
function onChange() {
    document.getElementById("display").innerText = displayValue;
}
