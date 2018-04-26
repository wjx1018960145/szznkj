"use strict";

var _keys = require("babel-runtime/core-js/object/keys");

var _keys2 = _interopRequireDefault(_keys);

var _typeof2 = require("babel-runtime/helpers/typeof");

var _typeof3 = _interopRequireDefault(_typeof2);

var _defineProperty = require("babel-runtime/core-js/object/define-property");

var _defineProperty2 = _interopRequireDefault(_defineProperty);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

!function (t) {
  function e(n) {
    if (r[n]) return r[n].exports;var i = r[n] = { i: n, l: !1, exports: {} };return t[n].call(i.exports, i, i.exports, e), i.l = !0, i.exports;
  }var r = {};e.m = t, e.c = r, e.i = function (t) {
    return t;
  }, e.d = function (t, r, n) {
    e.o(t, r) || (0, _defineProperty2.default)(t, r, { configurable: !1, enumerable: !0, get: n });
  }, e.n = function (t) {
    var r = t && t.__esModule ? function () {
      return t.default;
    } : function () {
      return t;
    };return e.d(r, "a", r), r;
  }, e.o = function (t, e) {
    return Object.prototype.hasOwnProperty.call(t, e);
  }, e.p = "", e(e.s = 219);
}({ 135: function _(t, e, r) {
    "use strict";
    t.exports = { computed: { imagePath: function imagePath() {
          return this.src.startsWith("http") || this.src.startsWith("file") ? this.src : this._getContext() + this.src;
        }, placeholderPath: function placeholderPath() {
          if ("" != this.placeholder) return this.placeholder.startsWith("http") || this.placeholder.startsWith("file") ? this.placeholder : this._getContext() + this.placeholder;
        } }, props: { width: { type: String }, height: { type: String }, src: { type: String }, resize: { type: String, default: "stretch" }, placeholder: { type: String, default: "" }, radius: { type: String, default: "0px" } }, methods: { _click: function _click(t) {
          this.$emit("click", t);
        }, _load: function _load() {
          this.$emit("load");
        }, _getContext: function _getContext() {
          var t = weex.config.bundleUrl,
              e = t.split("/").slice(0, -1).join("/");return t.indexOf("weex.html") > 0 && (e += "/dist/"), e;
        } } };
  }, 143: function _(t, e) {
    t.exports = { render: function render() {
        var t = this,
            e = t.$createElement;return (t._self._c || e)("image", { style: { "border-radius": t.radius, width: t.width, height: t.height }, attrs: { src: t.imagePath, placeholder: t.placeholderPath, resize: t.resize }, on: { click: function click(e) {
              t._click(e);
            }, load: function load(e) {
              t._load();
            } } });
      }, staticRenderFns: [] }, t.exports.render._withStripped = !0;
  }, 219: function _(t, e, r) {
    var n,
        i,
        s = [];n = r(135);var o = r(143);i = n = n || {}, "object" != (0, _typeof3.default)(n.default) && "function" != typeof n.default || ((0, _keys2.default)(n).some(function (t) {
      return "default" !== t && "__esModule" !== t;
    }) && console.error("named exports are not supported in *.vue files."), i = n = n.default), "function" == typeof i && (i = i.options), i.__file = "D:\\weexWorkspace\\android\\ConsumeloanWX\\src\\assets\\components\\bui-image.vue", i.render = o.render, i.staticRenderFns = o.staticRenderFns, i.style = i.style || {}, s.forEach(function (t) {
      for (var e in t) {
        i.style[e] = t[e];
      }
    }), "function" == typeof __register_static_styles__ && __register_static_styles__(i._scopeId, s), t.exports = n, t.exports.el = "true", new Vue(t.exports);
  } });
//# sourceMappingURL=bui-image.js.map