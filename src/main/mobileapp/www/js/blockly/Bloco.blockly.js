window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Bloco = window.blockly.js.blockly.Bloco || {};

/**
 * @function LogicaMobile
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 19/02/2025, 16:19:20
 *
 */
window.blockly.js.blockly.Bloco.LogicaMobileArgs = [];
window.blockly.js.blockly.Bloco.LogicaMobile = async function() {

  //
  this.cronapi.cordova.geolocation.getCurrentPosition(async function(sender_item) {
      item = sender_item;
    //
    Geo = item;
  }.bind(this), async function(sender_item) {
      item = sender_item;
    //
    this.cronapi.screen.notify('success','Um erro ocorreu ao tentar recuperar sua localização');
  }.bind(this));
}

/**
 * @function OlaMundo
 *
 *
 *
 *
 * @author Rafael Juan Cardoso Martins
 * @since 19/02/2025, 16:19:20
 *
 */
window.blockly.js.blockly.Bloco.OlaMundoArgs = [];
window.blockly.js.blockly.Bloco.OlaMundo = async function() {

  //
  this.cronapi.screen.notify('success','Testando 123');
}
