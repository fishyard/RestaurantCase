var selector = "#minDiv";
setInterval(oppdaterTekst, 1000);
function oppdaterTekst() {
    $.get("rest/services", function(data){
        $(selector).html(data);
    });
}
