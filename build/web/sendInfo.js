//alert("js funker");
$(document).ready(function(){
    //alert("test");
    var selector = "#sendInn";
    //alert(selector);
    
    /*$("#forrett").click(function(){
        //alert("funka");
        var forrett1 = document.createElement("INPUT");
        forrett1.setAttribute('type', 'radio');
        forrett1.setAttribute('name', salat);
        var forrett2 = document.createElement("INPUT");
        forrett2.setAttribute('type', 'radio');
        forrett2.setAttribute('name', brød);
    });*/
    $(selector).click(function(){
        //alert("knapp fungerer");
        var formData = JSON.stringify($("#form1").serializeArray());
        $.ajax({
            url: 'rest/services',
            type: 'POST',
            data: formData,
            dataType: "json",
            contentType: 'text/plain; charset=utf-8',
            success: function() {
                alert("Sending fungerer");
            }
        });
    });
});