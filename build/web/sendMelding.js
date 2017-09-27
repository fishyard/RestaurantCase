//alert("js funker");
$(document).ready(function(){
    //alert("test");
    var selector = "#btnSend";
    //alert(selector);
    $(selector).click(function(){
        //alert("knapp fungerer");
        $.ajax({
            url: 'rest/services',
            type: 'POST',
            data: $("#melding").val(),
            contentType: 'text/plain; charset=utf-8',
            success: function() {
                //alert("Sending fungerer");
            }
        });
    });
});