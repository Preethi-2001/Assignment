
function displayFormData() {
    const surveyForm = document.getElementById("surveyForm");
    const popup = document.getElementById("popup");
    const popupList = document.getElementById("popupList");
    const formData = new FormData(surveyForm);

    // Build a list of submitted values
    const values = [];
    for (const [key, value] of formData.entries()) {
        values.push(`<li><strong>${key}:</strong> ${value}</li>`);
    }

    // Display the values in the popup
    popupList.innerHTML = values.join("");
    popup.style.display = "block";
}

// JavaScript function to close the custom pop-up modal
function closePopup() {
    const popup = document.getElementById("popup");
    popup.style.display = "none";
    resetFormFields();
}

// JavaScript function to reset the form fields
function resetFormFields() {
    const surveyForm = document.getElementById("surveyForm");
    document.getElementById("firstName").value = "";
    document.getElementById("lastName").value = "";
    document.getElementById("dob").value = "";
    document.getElementById("country").value = "";
    const radioButtons = surveyForm.querySelectorAll('input[type="radio"]');
    for (const radioButton of radioButtons) {
        radioButton.checked = false;
    }
    document.getElementById("profession").value = "";
    document.getElementById("email").value = "";
    document.getElementById("mobile").value = "";
}
