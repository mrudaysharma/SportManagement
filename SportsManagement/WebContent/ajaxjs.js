var xmlhttp;
var element;
function requestData()
{
 var id="SportServer/";
}
function genUID() {
	var id = "sportsServer/id/UserID.jsp";
	loadContent(id, "UserID");
}
function getCountry() {
	var url = "sportsServer/UserLocation/Country.jsp";
	loadContent(url, "Country");
}
function loadContent(url, elements) {
    element =elements;
	xmlhttp = GetXmlHttpObject();

	if (xmlhttp == null) {
		alert("Your browser does not support Ajax HTTP");
		return;
	}
    
	xmlhttp.onreadystatechange = getOutput;

	xmlhttp.open("GET", url, true);
	xmlhttp.send(null);
}

function getOutput() {

	if (xmlhttp.readyState == 4) {
		if (xmlhttp.status == 200) {
			if (element == "UserID") {
				document.getElementsByName("userID")[0].value ="";
				document.getElementsByName("userID")[0].value = xmlhttp.responseText;
			}

			if (element == "Country") {
				document.getElementsByName("CountryText")[0].value ="";
				document.getElementsByName("CountryText")[0].value = xmlhttp.responseText;
			}

		}

	}
}

function GetXmlHttpObject() {
	if (window.XMLHttpRequest) {
		return new XMLHttpRequest();
	}
	if (window.ActiveXObject) {
		return new ActiveXObject("Microsoft.XMLHTTP");
	}
	return null;
}
