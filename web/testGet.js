$(document).ready(function(){
    var $bords = $("#bords");
    var $kunder = $("#kunder");
    var $gjester = $("#gjester");
    var $plasser = $("#plasserInn");
    
    $.ajax({
        url: 'rest/bord',
        type: 'GET',
        //data: $("#melding").val(),
        //contentType: 'text/plain; charset=utf-8',
        success: function(data) {
            $.each(data, function(i, bord){
                $bords.append("<li>id: "+ bord.id +", plasser: "+ bord.plasser + "</li>");
            });
        }
    });
    
    /*$.ajax({
        url: 'rest/kunde',
        type: 'GET',
        //data: $("#melding").val(),
        //contentType: 'text/plain; charset=utf-8',
        success: function(data) {
            $.each(data, function(i, kunde){
                $kunder.append("<li>id: "+ kunde.id +", plasser: "+ kunde.plasser + "</li>");
            });
        }
    });*/
    
    $.ajax({
        url: 'rest/gjest',
        type: 'GET',
        //data: $("#melding").val(),
        //contentType: 'text/plain; charset=utf-8',
        success: function(data) {
            $.each(data, function(i, gjest){
                $gjester.append("<li>id: " + gjest.id +" forrett: "+ gjest.forrett +", hovedrett: "+ gjest.hovedrett + ", dessert: " + gjest.dessert+ "</li>");
            });
        }
    });
    
    $("#btnPost").on("click", function(){
       //alert("knapp funka");
       var bord = {
           plasser: $plasser.val()
       };
       
       $.ajax({
          type: 'POST',
          url: 'rest/bord',
          data: bord,
          success: function(nyttBord){
              alert("sending fungerte");
              $bords.append("<li>id: "+ bord.id +", plasser: "+ bord.plasser + "</li>");
          },
          error: function(){
              alert("sending feilet");
          }
       });
    });
    
    
});