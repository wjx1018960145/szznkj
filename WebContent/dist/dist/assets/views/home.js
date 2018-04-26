"use strict";

var _keys = require("babel-runtime/core-js/object/keys");

var _keys2 = _interopRequireDefault(_keys);

var _typeof2 = require("babel-runtime/helpers/typeof");

var _typeof3 = _interopRequireDefault(_typeof2);

var _defineProperty = require("babel-runtime/core-js/object/define-property");

var _defineProperty2 = _interopRequireDefault(_defineProperty);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

!function (t) {
  function e(r) {
    if (i[r]) return i[r].exports;var n = i[r] = { i: r, l: !1, exports: {} };return t[r].call(n.exports, n, n.exports, e), n.l = !0, n.exports;
  }var i = {};e.m = t, e.c = i, e.i = function (t) {
    return t;
  }, e.d = function (t, i, r) {
    e.o(t, i) || (0, _defineProperty2.default)(t, i, { configurable: !1, enumerable: !0, get: r });
  }, e.n = function (t) {
    var i = t && t.__esModule ? function () {
      return t.default;
    } : function () {
      return t;
    };return e.d(i, "a", i), i;
  }, e.o = function (t, e) {
    return Object.prototype.hasOwnProperty.call(t, e);
  }, e.p = "", e(e.s = 222);
}({ 122: function _(t, e, i) {
    var r,
        n,
        o = [];o.push(i(124)), r = i(123);var s = i(125);n = r = r || {}, "object" != (0, _typeof3.default)(r.default) && "function" != typeof r.default || ((0, _keys2.default)(r).some(function (t) {
      return "default" !== t && "__esModule" !== t;
    }) && console.error("named exports are not supported in *.vue files."), n = r = r.default), "function" == typeof n && (n = n.options), n.__file = "D:\\weexWorkspace\\android\\ConsumeloanWX\\node_modules\\weex-ui\\packages\\wxc-minibar\\index.vue", n.render = s.render, n.staticRenderFns = s.staticRenderFns, n._scopeId = "data-v-71dc140a", n.style = n.style || {}, o.forEach(function (t) {
      for (var e in t) {
        n.style[e] = t[e];
      }
    }), "function" == typeof __register_static_styles__ && __register_static_styles__(n._scopeId, o), t.exports = r;
  }, 123: function _(t, e, i) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 });var r = weex.requireModule("navigator");e.default = { props: { backgroundColor: { type: String, default: "#FFC900" }, leftButton: { type: String, default: "https://gw.alicdn.com/tfs/TB1x18VpwMPMeJjy1XdXXasrXXa-21-36.png" }, textColor: { type: String, default: "#3D3D3D" }, rightButton: { type: String, default: "" }, title: { type: String, default: "标题" }, leftText: { type: String, default: "" }, rightText: { type: String, default: "" }, useDefaultReturn: { type: Boolean, default: !0 }, show: { type: Boolean, default: !0 } }, methods: { leftButtonClicked: function leftButtonClicked() {
          var t = this;t.useDefaultReturn && r.pop({}, function (t) {}), t.$emit("wxcMinibarLeftButtonClicked", {});
        }, rightButtonClicked: function rightButtonClicked() {
          var t = this;(t.rightText || t.rightButton) && t.$emit("wxcMinibarRightButtonClicked", {});
        } } };
  }, 124: function _(t, e) {
    t.exports = { "wxc-minibar": { width: 750, height: 90, flexDirection: "row", justifyContent: "space-between", alignItems: "center", backgroundColor: "#009ff0" }, left: { width: 180, paddingLeft: 32 }, "middle-title": { fontSize: 30, color: "#ffffff", height: 36, lineHeight: 34 }, right: { width: 180, paddingRight: 32, alignItems: "flex-end" }, "left-button": { width: 21, height: 36 }, "right-button": { width: 32, height: 32 }, "icon-text": { fontSize: 28, color: "#ffffff" } };
  }, 125: function _(t, e) {
    t.exports = { render: function render() {
        var t = this,
            e = t.$createElement,
            i = t._self._c || e;return t.show ? i("div", { staticClass: ["wxc-minibar"], style: { backgroundColor: t.backgroundColor } }, [i("div", { staticClass: ["left"], attrs: { ariaLabel: "返回", accessible: !0 }, on: { click: t.leftButtonClicked } }, [t._t("left", [t.leftButton && !t.leftText ? i("image", { staticClass: ["left-button"], attrs: { src: t.leftButton } }) : t._e(), t.leftText ? i("text", { staticClass: ["icon-text"], style: { color: t.textColor } }, [t._v(t._s(t.leftText))]) : t._e()])], 2), t._t("middle", [i("text", { staticClass: ["middle-title"], style: { color: t.textColor } }, [t._v(t._s(t.title))])]), i("div", { staticClass: ["right"], on: { click: t.rightButtonClicked } }, [t._t("right", [t.rightButton && !t.rightText ? i("image", { staticClass: ["right-button"], attrs: { src: t.rightButton, ariaHidden: !0 } }) : t._e(), t.rightText ? i("text", { staticClass: ["icon-text"], style: { color: t.textColor } }, [t._v(t._s(t.rightText))]) : t._e()])], 2)], 2) : t._e();
      }, staticRenderFns: [] }, t.exports.render._withStripped = !0;
  }, 134: function _(t, e, i) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 }), e.default = { props: ["imageList"], data: function data() {
        return {};
      }, methods: { onchange: function onchange(t) {} } };
  }, 140: function _(t, e) {
    t.exports = { iconfont: { fontFamily: "iconfont" }, image: { width: 750, height: 400 }, slider: { width: 750, height: 400 }, frame: { width: 750, height: 400, position: "relative" }, indicator: { width: 750, height: 40, itemColor: "white", itemSelectedColor: "#b4282d", itemSize: 12, position: "absolute", bottom: 10, right: 0 } };
  }, 144: function _(t, e) {
    t.exports = { render: function render() {
        var t = this,
            e = t.$createElement,
            i = t._self._c || e;return i("slider", { staticClass: ["slider"], attrs: { autoPlay: "true", interval: "3000" }, on: { change: t.onchange } }, [t._l(t.imageList, function (t) {
          return i("div", { staticClass: ["frame"] }, [i("image", { staticClass: ["image"], attrs: { resize: "stretch", src: t.src } })]);
        }), i("indicator", { staticClass: ["indicator"] })], 2);
      }, staticRenderFns: [] }, t.exports.render._withStripped = !0;
  }, 149: function _(t, e, i) {
    "use strict";
    function r(t) {
      return t && t.__esModule ? t : { default: t };
    }Object.defineProperty(e, "__esModule", { value: !0 });var n = i(56),
        o = r(n),
        s = i(168),
        a = r(s),
        c = i(164),
        l = weex.requireModule("modal");e.default = { components: { "wxc-minibar": o.default, "yx-slider": a.default }, data: function data() {
        return { rightButton: c.MESSAGE_ICON, YXBanners: [{ title: "", src: "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3247568695,112898598&fm=27&gp=0.jpg" }, { title: "", src: "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1520500235719&di=3cb4eb4924464a82815069b4e652d2e3&imgtype=0&src=http%3A%2F%2Fimg.mp.itc.cn%2Fupload%2F20160519%2Fa3c0e27b19314ee586bb8431818ba51f_th.jpg" }, { title: "", src: "http://doc.zwwill.com/yanxuan/imgs/banner-1.jpg" }, { title: "", src: "http://doc.zwwill.com/yanxuan/imgs/banner-2.jpg" }], items: [{ src: "https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=2954275189,4191722338&fm=27&gp=0.jpg", name: "旅游贷", desc: "Genius only means hard-working all one's life" }, { src: "https://gw.alicdn.com/tps/TB1Hv1JPFXXXXa3XXXXXXXXXXXX-370-370.jpg", name: "进修贷款", desc: 'The man who has made up his mind to win will never say "impossible "' }, { src: "https://gw.alicdn.com/tps/TB1eNKuPFXXXXc_XpXXXXXXXXXX-370-370.jpg", name: "车贷", desc: "There is no such thing as a great talent without great will - power" }] };
      }, methods: { onrefresh: function onrefresh(t) {
          var e = this;l.toast({ message: "Refreshing", duration: 1 }), this.refreshing = !0, setTimeout(function () {
            e.refreshing = !1;
          }, 2e3);
        }, onpullingdown: function onpullingdown(t) {
          console.log("dy: " + t.dy), console.log("pullingDistance: " + t.pullingDistance), console.log("viewHeight: " + t.viewHeight), console.log("type: " + type);
        }, minibarRightButtonClick: function minibarRightButtonClick() {
          l.toast({ message: "消息", duration: 1 }), console.log("message");
        } } };
  }, 156: function _(t, e) {
    t.exports = { info_tag: { margin: 4, width: 750, height: 48, backgroundColor: "#FFFFFF", padding: 8, justifyContent: "flex-start", flexWrap: "nowrap", flexDirection: "row" }, tag: { marginLeft: 4, marginRight: 4, width: 10, height: 30, backgroundColor: "#0088fb" }, text: { color: "#666666", fontFamily: '"宋体",serif', fontSize: 24 }, product_name: { color: "#666666", fontSize: 26 }, property: { color: "#FF5722", fontSize: 30 }, recomend: { marginRight: 4, marginLeft: 4, backgroundColor: "#FFFFFF", marginBottom: 16 }, wrapper: { width: 750, position: "absolute", top: 0, left: 0, right: 0, bottom: 0, backgroundColor: "#f4f4f4" }, scroller: { width: 750 } };
  }, 161: function _(t, e) {
    t.exports = { render: function render() {
        var t = this,
            e = t.$createElement,
            i = t._self._c || e;return i("div", { staticClass: ["wrapper"] }, [i("wxc-minibar", { attrs: { title: "有信金服", leftButton: "", textColor: "#FFFFFF", backgroundColor: "#00A3FF", rightButton: t.rightButton }, on: { wxcMinibarRightButtonClicked: t.minibarRightButtonClick } }), i("scroller", { attrs: { offsetAccuracy: "300px" } }, [i("yx-slider", { attrs: { imageList: t.YXBanners } }), t._m(0), i("waterfall", { staticClass: ["scroller"], attrs: { columnCount: "2", columnGap: "normal" } }, t._l(t.items, function (e, r) {
          return i("cell", { key: e.src, ref: "index", refInFor: !0, appendAsTree: !0, attrs: { append: "tree" } }, [i("div", { staticClass: ["recomend"] }, [e.name ? i("text", { staticClass: ["product_name"] }, [t._v(t._s(e.name))]) : t._e(), i("image", { staticStyle: { width: "355px", height: "200px" }, attrs: { src: e.src } }), i("text", { staticClass: ["property"], attrs: { id: "property_1" } }, [t._v("旅游贷")]), i("text", { staticClass: ["property"], attrs: { id: "property_2" } }, [t._v("旅游贷")]), i("text", { staticClass: ["property"], attrs: { id: "property_3" } }, [t._v("旅游贷")])])]);
        }))], 1)], 1);
      }, staticRenderFns: [function () {
        var t = this,
            e = t.$createElement,
            i = t._self._c || e;return i("div", { staticClass: ["info_tag"] }, [i("div", { staticClass: ["tag"] }), i("text", { staticClass: ["text"] }, [t._v("推荐产品")])]);
      }] }, t.exports.render._withStripped = !0;
  }, 164: function _(t, e, i) {
    "use strict";
    Object.defineProperty(e, "__esModule", { value: !0 });e.MESSAGE_ICON = "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAACG0lEQVRoQ+2Y/U0DMQzF35sAmADYADagG8AGZQJgAtoJKBPABrABMAFlAtgAmMDooVSqTrrESRNoq/OfbS7xz37Oh4kNN264/xgA/juDQwa2MgNmtgvgBsBpALwHMCX5VRu4iYTM7AnAScfZZ5KjtQcwsyMArz2OHpOc14SomoEgnQsAkx4n9fttTSlVAVhy/BKA9B8z1cGsFsjKAGamQr1zON6FEsg5ycdVJLUSgJlpp1HUV7EZyavSCYoBzEwykN5rmOqiKBBFAEE2DzU8X5rjrERO2QChYN8LNJ/iVU0c5u5QJQBKtbTfwlTUOrXdVgKgQ0qHVQt7Idk9waPrZAEE+Xy28HwxJ8ksn7IGm5mio3tOSxuRfPYuMAB4I5UxbshAb7C2oQZid/0MlUSH6jD78E6WVcSa1MzMO3nJuKbb6ADgSMmQgVSQhhpIRKiphP7iMgdgL+dN4N5GzewAgF5hra7Si9yob6TXmesscAGY2XWk15Mqm9L/JySnqY+jAEEyuj63jnqfn8qGLne9PdUUwDj0fFKBaPl/9JmZAlDTqnb3IRc22q1I1kBooXglpLZiqleU1PUS4TzVakkC5ITLs83m7vOp9asChMuetr/9noXfSHqzmfL99/8WALGHf9Zz0UNQHSBkQcWvBtVOcOIbwDilZ4/D3TFNABaLhNMb3lN17QBKHMr9pmkGcp0pGT8AlESt5jcbn4EfuFu6MZc5YU4AAAAASUVORK5CYII=";
  }, 168: function _(t, e, i) {
    var r,
        n,
        o = [];o.push(i(140)), r = i(134);var s = i(144);n = r = r || {}, "object" != (0, _typeof3.default)(r.default) && "function" != typeof r.default || ((0, _keys2.default)(r).some(function (t) {
      return "default" !== t && "__esModule" !== t;
    }) && console.error("named exports are not supported in *.vue files."), n = r = r.default), "function" == typeof n && (n = n.options), n.__file = "D:\\weexWorkspace\\android\\ConsumeloanWX\\src\\assets\\components\\YXSlider.vue", n.render = s.render, n.staticRenderFns = s.staticRenderFns, n._scopeId = "data-v-f6aa709e", n.style = n.style || {}, o.forEach(function (t) {
      for (var e in t) {
        n.style[e] = t[e];
      }
    }), "function" == typeof __register_static_styles__ && __register_static_styles__(n._scopeId, o), t.exports = r;
  }, 222: function _(t, e, i) {
    var r,
        n,
        o = [];o.push(i(156)), r = i(149);var s = i(161);n = r = r || {}, "object" != (0, _typeof3.default)(r.default) && "function" != typeof r.default || ((0, _keys2.default)(r).some(function (t) {
      return "default" !== t && "__esModule" !== t;
    }) && console.error("named exports are not supported in *.vue files."), n = r = r.default), "function" == typeof n && (n = n.options), n.__file = "D:\\weexWorkspace\\android\\ConsumeloanWX\\src\\assets\\views\\home.vue", n.render = s.render, n.staticRenderFns = s.staticRenderFns, n._scopeId = "data-v-55edef12", n.style = n.style || {}, o.forEach(function (t) {
      for (var e in t) {
        n.style[e] = t[e];
      }
    }), "function" == typeof __register_static_styles__ && __register_static_styles__(n._scopeId, o), t.exports = r, t.exports.el = "true", new Vue(t.exports);
  }, 56: function _(t, e, i) {
    "use strict";
    function r(t) {
      return t && t.__esModule ? t : { default: t };
    }Object.defineProperty(e, "__esModule", { value: !0 });var n = i(122);Object.defineProperty(e, "default", { enumerable: !0, get: function get() {
        return r(n).default;
      } });
  } });
//# sourceMappingURL=home.js.map