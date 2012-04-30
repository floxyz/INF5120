$(document).ready ->
  $('svg').attr('viewbox','0 0 0 0')
  $('.journeys svg').attr('height','175px')
  $('.touchpoint').hover(
    -> $('[id='+$(this).data("id")+'] ellipse').attr('stroke-width','3px'),
    -> $('[id='+$(this).data("id")+'] ellipse').attr('stroke-width','')
  )

  $('g.node').hover(
    (->
      console.log $(this).attr('id'), '.touchpoint[data-id='+$(this).attr('id')+']'
      $('.touchpoint[data-id='+$(this).attr('id')+']').addClass('highlighted')),
    -> $('.touchpoint[data-id='+$(this).attr('id')+']').removeClass('highlighted')
  )
