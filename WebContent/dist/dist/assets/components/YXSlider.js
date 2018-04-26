"use strict";

var _keys = require("babel-runtime/core-js/object/keys");

var _keys2 = _interopRequireDefault(_keys);

var _typeof2 = require("babel-runtime/helpers/typeof");

var _typeof3 = _interopRequireDefault(_typeof2);

var _defineProperty = require("babel-runtime/core-js/object/define-property");

var _defineProperty2 = _interopRequireDefault(_defineProperty);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

!function (e) {
  function t(n) {
    if (r[n]) return r[n].exports;var o = r[n] = { i: n, l: !1, exports: {} };return e[n].call(o.exports, o, o.exports, t), o.l = !0, o.exports;
  }var r = {};t.m = e, t.c = r, t.i = function (e) {
    return e;
  }, t.d = function (e, r, n) {
    t.o(e, r) || (0, _defineProperty2.default)(e, r, { configurable: !1, enumerable: !0, get: n });
  }, t.n = function (e) {
    var r = e && e.__esModule ? function () {
      return e.default;
    } : function () {
      return e;
    };return t.d(r, "a", r), r;
  }, t.o = function (e, t) {
    return Object.prototype.hasOwnProperty.call(e, t);
  }, t.p = "", t(t.s = 218);
}({ 134: function _(e, t, r) {
    "use strict";
    Object.defineProperty(t, "__esModule", { value: !0 }), t.default = { props: ["imageList"], data: function data() {
        return {};
      }, methods: { onchange: function onchange(e) {} } };
  }, 140: function _(e, t) {
    e.exports = { iconfont: { fontFamily: "iconfont" }, image: { width: 750, height: 400 }, slider: { width: 750, height: 400 }, frame: { width: 750, height: 400, position: "relative" }, indicator: { width: 750, height: 40, itemColor: "white", itemSelectedColor: "#b4282d", itemSize: 12, position: "absolute", bottom: 10, right: 0 } };
  }, 144: function _(e, t) {
    e.exports = { render: function render() {
        var e = this,
            t = e.$createElement,
            r = e._self._c || t;return r("slider", { staticClass: ["slider"], attrs: { autoPlay: "true", interval: "3000" }, on: { change: e.onchange } }, [e._l(e.imageList, function (e) {
          return r("div", { staticClass: ["frame"] }, [r("image", { staticClass: ["image"], attrs: { resize: "stretch", src: e.src } })]);
        }), r("indicator", { staticClass: ["indicator"] })], 2);
      }, staticRenderFns: [] }, e.exports.render._withStripped = !0;
  }, 218: function _(e, t, r) {
    var n,
        o,
        i = [];i.push(r(140)), n = r(134);var s = r(144);o = n = n || {}, "object" != (0, _typeof3.default)(n.default) && "function" != typeof n.default || ((0, _keys2.default)(n).some(function (e) {
      return "default" !== e && "__esModule" !== e;
    }) && console.error("named exports are not supported in *.vue files."), o = n = n.default), "function" == typeof o && (o = o.options), o.__file = "D:\\weexWorkspace\\android\\ConsumeloanWX\\src\\assets\\components\\YXSlider.vue", o.render = s.render, o.staticRenderFns = s.staticRenderFns, o._scopeId = "data-v-f6aa709e", o.style = o.style || {}, i.forEach(function (e) {
      for (var t in e) {
        o.style[t] = e[t];
      }
    }), "function" == typeof __register_static_styles__ && __register_static_styles__(o._scopeId, i), e.exports = n, e.exports.el = "true", new Vue(e.exports);
  } });
//# sourceMappingURL=YXSlider.js.map