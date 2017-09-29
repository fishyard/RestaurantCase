   
$(document).ready(function(){
    $("#knapp").click(function(){
        //var formData = JSON.stringify($("#form1").serializeArray());
        $.ajax({
                url: 'rest/bord/3',
                type: 'POST',
                data: $("#tall").val(),
                //data: formData,
                //dataType: "json",
                contentType: 'text/plain; charset=utf-8',
                success: function() {
                    alert("Sending fungerer");
                }
        });
    });
});