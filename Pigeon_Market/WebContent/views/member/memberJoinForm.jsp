
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>

<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>


<style>
	.outer{
		width:600px;
		height:500px;
		margin-left:auto;
		margin-right:auto;
		margin-top:50px;
	}  
	#idCheck:hover, #joinBtn:hover, #goMain:hover {
		cursor:pointer;
	}
 	 #joinForm table{
		width:100%;
		margin-left:auto;
		margin-right:auto;
	}
 	#joinForm td{
		text-align:right;
	} 
	#idCheck{
		text-align:left;
	}
	 #joinBtn{
		background:yellowgreen;
	}
	#joinBtn, #goMain{
		display:inline-block;
	}
	
	
	fieldset{
	    border: none;
	}
	
	fieldset > div{ 
	    position: relative;
	    margin-bottom: 10px;
	}    
	
	
#wrap_gender{
    border-radius: 4px;
    border: 1px solid #ccc;
    display: flex;
}
.gender{
    display: block;
    height: 100%; width: 50%;
    border-right: 1px solid #ccc;
}
.gender > label {
    display: block;
    /*width: 100%; height: 100%;*/
    padding: 10px 0;
    text-align: center;
    font-size: 0.8em;
    color: #666;
}
.gender_act{
    display: inline-block;
    height: 100%; width: 50%;
    background-color: #45a049;
    color:#fff;
}
.gender_act > label {
    display: inline-block;
    width: 100%; height: 100%;
    padding: 10px 0;
    text-align: center;
    font-size: 0.8em;
    color: #fff;
}
 body{text-align: center;}
 
 @font-face{
    src: url("resources/assets/fonts/BMJUA_ttf.ttf");
    font-family: "Jua";
    }
    
</style>
</head>
<body>


<svg class="svgmate" version="1" baseProfile="tiny" id="sla" xmlns="http://www.w3.org/2000/svg" width="584" viewBox="0 0 584 610" style="max-width:100%;max-height:99vh"><style>@keyframes leafrotein{0%{transform:rotate(-120deg) scale(0)}to{transform:rotate(0) scale(1)}}@keyframes leafrotein2{0%{transform:rotate(120deg) scale(0)}to{transform:rotate(0) scale(1)}}@keyframes leafyshadowin{0%,50%{opacity:0}to{opacity:1}}@keyframes leafystreatchin2{0%{transform:scale(0) rotate(-30deg)}to{transform:scale(1) rotate(0)}}@keyframes leafystreatchin{0%,50%{transform:scale(0) rotate(20deg)}to{transform:scale(1) rotate(0)}}@keyframes flagywave{0%,to{transform:skewY(0)}50%{transform:skewY(-7deg) scaleX(.95)}}@keyframes plantywafe{0%,to{transform:skewY(0)}50%{transform:skewY(-5deg) scaleX(.96) rotate(6deg)}}@keyframes leftplantywafe{0%,to{transform:skewY(0)}50%{transform:skewY(5deg) scaleX(.96) rotate(-6deg)}}@keyframes birdpop{0%{transform:translateY(30px)}90%{transform:translateY(30px);animation-timing-function:cubic-bezier(.88,.77,.51,1.37)}to{transform:translateY(0)}}#sla.svgmate #_x3C_Green_Fern_-_Left_x3E_ .leafy,#sla.svgmate #_x3C_Green_Fern_-_Right_x3E_ .leafy{animation-name:leafrotein;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:429.022px 576.642px;animation-iteration-count:1}#sla.svgmate #_x3C_Green_Fern_-_Left_x3E_ .leafy{animation-name:leafrotein2;transform-origin:150px 576.642px}#sla.svgmate #_x3C_Green_Fern_-_Left_x3E_ .shadowleafy,#sla.svgmate #_x3C_Green_Fern_-_Right_x3E_ .shadowleafy{animation-name:leafyshadowin;animation-duration:2.65s;transform-origin:429.022px 576.642px;animation-iteration-count:1}</style><defs><clipPath id="junglemasky"><path fill="none" stroke="#22201E" stroke-miterlimit="10" d="M0 186h585l-2 392H0z"/></clipPath></defs><g id="BACKPACK"><g id="_x3C_FLAG_x3E_"><path id="_x3C_Flag_Pole_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M368 577V51"/><path id="_x3C_Flag_x3E_" fill="#FFF" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" stroke-miterlimit="10" d="M373 74c0 10-5 19-5 20 18-3 34 9 51 10 19 0 28-13 28-15s-16 2-32-9c-22-18-35-22-46-19 0 2 4 7 4 13z" style="animation-name:flagywave;animation-duration:3s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:368px 73px"/><path id="_x3C_Hart_x3E__1_" fill="#69BF56" d="M356 59v-2c1-1 4 0 5 1l2 3-5 2c-6 0-4-3-2-4z"/><path id="_x3C_Hart_x3E_" fill="#69BF56" d="M357 94v2c1 2 3 1 4 0l3-4-5-2c-5 0-5 3-2 4z"/></g><g id="_x3C_Backpack_-_Right_x3E_"><path id="_x3C_Backpack_x3E__3_" fill="#22201E" d="M410 207s0-2-2-2l-116 2v29h110c6 0 8-4 8-7v-22z"/><path id="_x3C_Backpack_x3E__2_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M408 181H292v29h108c6 0 8-4 8-7v-22z"/><path id="_x3C_Backpack_x3E__1_" fill="#D2D3D4" d="M291 181h116v16H291z"/><path id="_x3C_Backpack_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M408 157H292v29h108c5 0 7-3 8-5v-2-22z"/><g id="_x3C_Backpack_-_Strap_x3E_"><path fill="#6BBF5A" d="M389 158h11v78h-11z"/><path fill="#FFF" d="M392 158h5v78h-5z"/></g></g><g id="_x3C_Backpack_-_Left_x3E_"><path id="_x3C_Backpack_x3E__7_" fill="#22201E" d="M174 207s0-2 3-2l115 2v29H182c-6 0-8-4-8-7v-22z"/><path id="_x3C_Backpack_x3E__6_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M176 181h116v29H184c-5 0-8-4-8-7v-22z"/><path id="_x3C_Backpack_x3E__5_" fill="#D2D3D4" d="M177 181h116v16H177z"/><path id="_x3C_Backpack_x3E__4_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M176 157h116v29H184c-4 0-7-3-7-5l-1-2v-22z"/><g id="_x3C_Backpack_-_Strap_x3E__1_"><path fill="#6BBF5A" d="M184 158h11v78h-11z"/><path fill="#FFF" d="M187 158h5v78h-5z"/></g></g></g><g id="PLANTS_-_Back_Section"><g id="_x3C_PADDLE_PLANT_x3E_"><g style="animation-name:leafystreatchin;animation-duration:1.9s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:397.895px 448.271px;animation-iteration-count:1"><g class="rightplantwave" style="animation-name:plantywafe;animation-duration:3.9s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:397.895px 448.271px" id="PADDLE_PLANT_-_Right"><g id="_x3C_Leave_Paddle_-_Left_x3E_"><path id="_x3C_Leave_Paddle_x3E_" fill="#D2D3D4" d="M521 99c-10-8-29-3-39 15-10 17-10 46-10 46s30-7 45-20 14-33 4-41z"/><g id="_x3C_Leave_Paddle_x3E__3_"><path id="_x3C_Leave_Paddle_x3E__1_" fill="#D2D3D4" d="M391 138c-5 8-4 19 3 28l18-3-7 12 3 1c17 9 47 7 47 7s-9-29-23-43c-15-13-34-12-41-2z"/><path fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" stroke-miterlimit="10" d="M405 174l6-10-16 2"/></g><path id="_x3C_Leave_Paddle_x3E__2_" fill="#D2D3D4" d="M516 204c-3-13-21-20-40-13-18 7-36 30-36 30s28 14 47 12c20-2 32-16 29-29z"/><path id="_x3C_Leave_Paddle_x3E__4_" fill="#D2D3D4" d="M499 283c-3-12-21-19-39-12-19 7-37 30-37 30s28 14 48 12c19-2 31-17 28-30z"/><path id="_x3C_Leave_Paddle_x3E__5_" fill="#D2D3D4" d="M368 215c-8 10-1 29 17 38 17 9 46 7 46 7s-8-29-22-43-33-13-41-2z"/></g><g id="_x3C_PlantVein_-_Left_x3E_"><g id="_x3C_PlantVein_x3E__19_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__1_" d="M455 186s8-9 37-15"/><path id="_x3C_PlantVein_x3E__2_" d="M478 174l8 8"/></g><g id="_x3C_PlantVein_x3E__18_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E_" d="M520 100l-35 43c-20 26-45 53-53 114l-34 191"/><path id="_x3C_PlantVein_x3E__3_" d="M504 120l-4-22"/><path id="_x3C_PlantVein_x3E__4_" d="M489 138l30-3"/></g><g id="_x3C_PlantVein_x3E__17_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__5_" d="M455 183s-49-36-63-43"/><path id="_x3C_PlantVein_x3E__6_" d="M431 166l-5-28"/><path id="_x3C_PlantVein_x3E__7_" d="M413 154l-21 6"/><path id="_x3C_PlantVein_x3E__8_" d="M438 171l-13 2"/></g><g id="_x3C_Flower_-_Black_x3E_"><path id="_x3C_PlantVein_x3E__11_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M444 208l-11-4"/><circle id="_x3C_Flower_-_Black_Dot_x3E_" fill="#241F21" cx="429" cy="202" r="4"/></g><g id="_x3C_PlantVein_x3E__15_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__12_" d="M425 300l71-16"/><path id="_x3C_PlantVein_x3E__13_" d="M476 289l8-18"/><path id="_x3C_PlantVein_x3E__14_" d="M453 294l25 15"/></g><g id="_x3C_PlantVein_x3E__16_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__9_" d="M439 222s21-9 76-15"/><path id="_x3C_PlantVein_x3E__10_" d="M493 209l10-17"/><path id="_x3C_PlantVein_x3E_v" d="M458 216l26 16"/></g><g id="_x3C_PlantVein_x3E__23_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__22_" d="M429 258l-59-38"/><path id="_x3C_PlantVein_x3E__21_" d="M406 239l-4-24"/><path id="_x3C_PlantVein_x3E__20_" d="M418 249l-25-2"/></g></g><g id="_x3C_Flower_-_Green_Dots_x3E_" fill="#69BF56"><circle cx="503" cy="163" r="2"/><circle cx="504" cy="169" r="2"/><circle cx="498" cy="173" r="2"/><circle cx="511" cy="171" r="2"/><circle cx="497" cy="167" r="2"/><circle cx="510" cy="165" r="2"/><circle cx="505" cy="175" r="2"/></g></g></g><g id="PADDLE_PLANT_-_Left" style="animation-name:leafystreatchin2;animation-duration:1.9s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:397.895px 448.271px;animation-iteration-count:1"><g class="leftplantwave" style="animation-name:leftplantywafe;animation-duration:3.8s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:250.895px 448.271px" id="_x3C_Leave_Paddle_-_Left_x3E__1_"><path id="_x3C_Leave_Paddle_x3E__11_" fill="#D2D3D4" d="M67 99c10-8 29-3 39 15s10 46 10 46-30-7-45-20-14-33-4-41z"/><g id="_x3C_Leave_Paddle_x3E__9_"><path id="_x3C_Leave_Paddle_x3E__10_" fill="#D2D3D4" d="M197 138c5 8 4 19-3 28l-18-3 7 12-3 1c-17 9-47 7-47 7s9-29 23-43c15-13 34-12 41-2z"/><path fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" stroke-miterlimit="10" d="M183 174l-6-10 16 2"/></g><path id="_x3C_Leave_Paddle_x3E__8_" fill="#D2D3D4" d="M72 204c3-13 21-20 40-13 18 7 36 30 36 30s-28 14-47 12c-20-2-32-16-29-29z"/><path id="_x3C_Leave_Paddle_x3E__7_" fill="#D2D3D4" d="M89 283c3-12 21-19 39-12 19 7 37 30 37 30s-28 14-48 12c-19-2-31-17-28-30z"/><path id="_x3C_Leave_Paddle_x3E__6_" fill="#D2D3D4" d="M220 215c7 10 1 29-17 38-17 9-47 7-47 7s9-29 23-43 33-13 41-2z"/><g id="_x3C_PlantVein_-_Left_x3E__1_"><g id="_x3C_PlantVein_x3E__45_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__47_" d="M133 186s-8-9-37-15"/><path id="_x3C_PlantVein_x3E__46_" d="M110 174l-8 8"/></g><g id="_x3C_PlantVein_x3E__41_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__44_" d="M68 100l35 43c20 26 45 53 53 114l34 191"/><path id="_x3C_PlantVein_x3E__43_" d="M84 120l4-22"/><path id="_x3C_PlantVein_x3E__42_" d="M99 138l-30-3"/></g><g id="_x3C_PlantVein_x3E__36_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__40_" d="M133 183s49-36 63-43"/><path id="_x3C_PlantVein_x3E__39_" d="M157 166l5-28"/><path id="_x3C_PlantVein_x3E__38_" d="M175 154l21 6"/><path id="_x3C_PlantVein_x3E__37_" d="M150 171l13 2"/></g><g id="_x3C_Flower_-_Black_x3E__1_"><path id="_x3C_PlantVein_x3E__35_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M144 208l11-4"/><circle id="_x3C_Flower_-_Black_Dot_x3E__1_" fill="#241F21" cx="159" cy="202" r="4"/></g><g id="_x3C_PlantVein_x3E__31_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__34_" d="M163 300l-71-16"/><path id="_x3C_PlantVein_x3E__33_" d="M112 289l-8-18"/><path id="_x3C_PlantVein_x3E__32_" d="M135 294l-25 15"/></g><g id="_x3C_PlantVein_x3E__28_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__30_" d="M149 222s-21-9-76-15"/><path id="_x3C_PlantVein_x3E__29_" d="M94 209l-9-17"/><path id="_x3C_PlantVein_x3E_v_1_" d="M130 216l-26 16"/></g><g id="_x3C_PlantVein_x3E__24_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path id="_x3C_PlantVein_x3E__27_" d="M159 258l59-38"/><path id="_x3C_PlantVein_x3E__26_" d="M182 239l4-24"/><path id="_x3C_PlantVein_x3E__25_" d="M169 249l26-2"/></g></g><g id="_x3C_Flower_-_Green_Dots_x3E__1_" fill="#69BF56"><circle cx="85" cy="163" r="2"/><circle cx="84" cy="169" r="2"/><circle cx="90" cy="173" r="2"/><circle cx="77" cy="171" r="2"/><circle cx="91" cy="167" r="2"/><circle cx="78" cy="165" r="2"/><circle cx="83" cy="175" r="2"/></g></g></g><g id="_x3C_MONSTER_PALM_x3E_"><g style="animation-name:leafystreatchin;animation-duration:1.6s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:397.895px 448.271px;animation-iteration-count:1"><g class="rightplantwave" style="animation-name:plantywafe;animation-duration:3s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:397.895px 448.271px" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" id="MONSTER_PALM_-_Right"><path id="_x3C_MosterPalm_x3E__1_" fill="#FFF" d="M493 363c43 0 37-27 34-32-5 5-22 6-28 6-10 0-21 2-21-7 0-5 8-4 21-4 2 0 19 0 25-11s1-29 0-31c-14 17-18 21-29 21-13 0-16-14-1-14 20 0 29-11 28-20 0-10-5-16-7-18-3 7-12 16-16 19-4 4-13 6-18 2s0-9 9-12c11-2 16-7 16-14s-4-11-7-15c-4 11-14 17-18 12-3-5 3-6 5-6 3-2 7-3 7-10 0-11-13-27-13-27s-19 7-24 18c-4 6-1 9 0 12 2 1 7 5 3 8-5 4-12-8-12-19-4 2-11 5-13 11s0 14 9 21c7 6 10 12 4 14-7 2-14-4-16-9-3-5-7-20-7-27-3 1-10 5-14 14-4 8 0 24 18 33 13 6 5 17-7 12-10-5-12-10-17-31-2 1-15 15-13 28 1 13 16 19 18 20 12 5 20 8 17 13-3 7-12 1-21-3-6-3-21-10-24-16-4 3-21 25 19 42 15 7 33 13 29 23-2 7-8 10-24 5-16-6-25-14-28-22-1 9-10 63 53 76 74 17 83-40 85-49-6 6-21 11-38 10s-21-7-20-15c1-10 20-8 36-8zm-13-56c4 0 7 2 7 5 0 2-3 5-7 5s-8-1-8-5c0-3 4-5 8-5z"/><path id="_x3C_MosterPalm_Vein_x3E__1_" fill="none" d="M469 235l-44 185"/></g></g><g style="animation-name:leafystreatchin2;animation-duration:1.6s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:300px 448.271px;animation-iteration-count:1"><g class="leftplantwave" style="animation-name:leftplantywafe;animation-duration:2.9s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:250.895px 448.271px" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" id="MONSTER_PALM_-_left"><path id="_x3C_MosterPalm_x3E_" fill="#FFF" d="M131 371c0 8-4 14-20 15s-32-4-38-10c2 9 10 65 85 49 56-11 54-67 52-76-3 8-11 16-27 22-16 5-22 2-24-5-4-10 14-16 29-23 39-17 23-39 19-42-3 6-18 13-24 16-9 4-18 10-21 3-3-5 5-8 16-13 3-1 18-7 19-20 2-13-11-27-13-28-5 21-8 26-17 31-12 5-21-6-7-12 18-9 22-25 18-33-4-9-11-13-14-14 0 7-4 22-7 27-2 5-10 11-16 9s-4-8 4-14c9-7 12-16 9-21s-9-9-13-12c0 12-7 24-12 20-4-3 1-7 2-8 2-3 4-6 1-13-5-10-24-17-24-17s-14 16-13 27c0 7 4 8 7 9 2 1 8 2 5 7-4 5-14-1-18-12-3 4-7 9-7 15s5 12 16 14c9 3 13 8 9 12s-14 2-18-2c-5-3-13-12-16-19-2 2-7 8-7 18-1 9 8 20 28 20 15 0 12 14-1 14-11 0-15-4-29-21-1 2-7 20 0 31s23 11 25 11c13 0 21-1 21 5 0 8-11 6-21 6-7 0-23-1-28-6-3 5-2 31 41 32 16 0 28-2 29 8zm-15-59c0 4-4 5-8 5s-7-3-7-5c0-3 2-5 7-5 4 0 8 2 8 5z"/><path id="_x3C_MosterPalm_Vein_x3E_" fill="none" d="M119 235l44 185"/></g></g></g></g><g id="Mid-hair"><g id="_x3C_Hair_-_BACK_-_Right_x3E_"><path id="_x3C_Hair_-_Body_-_Right_x3E_" fill="#68C156" d="M292 126s10 21 40 29c5 1 25 26-12 64-5 6-8 9-8 16s4 9 4 18-11 22-11 30 9 12 9 27-15 20-15 20 11 7 33 9c38 4 68-60 68-60s25 6 30 28c0 0 6-3 8-13 3-20-18-31-17-44 1-29-24-23-36-25-15-2-32-18-35-35-3-10 12-72-58-64z"/><path id="_x3C_Hair_-_Line_-_Right_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M395 235s16 1 16 13c0 15 14 25 14 36 0 4 0 7-2 10"/></g></g><g id="HUMAN_-_Back_Section"><g id="_x3C_SHIRT_-_Left_x3E_"><g id="_x3C_Shirt_-_Gray_Section_x3E__1_"><path id="_x3C_Shirt_-_Gray_x3E__1_" fill="#D2D3D4" d="M232 266l-35 11-2 301 97-1 1-220-61-90"/><g id="Shirt_-_Pocket2_x3E__1_"><path id="_x3C_Shirt_-_PocketBody_x3E__3_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M227 379v-18h46v18c0 2 2 20-23 20-24 0-23-18-23-20z"/><g id="_x3C_Shirt_-_PocketDetail_x3E__3_"><circle fill="#FFF" cx="250" cy="368" r="3"/><path fill="none" stroke="#FFF" stroke-width="2" stroke-miterlimit="10" d="M272 376h-44"/></g></g><g id="Shirt_-_Pocket1_x3E__1_"><path id="_x3C_Shirt_-_PocketBody_x3E__2_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M227 431v-18h46v18c0 2 2 20-23 20-24 0-23-18-23-20z"/><g id="_x3C_Shirt_-_PocketDetail_x3E__2_"><circle fill="#FFF" cx="250" cy="420" r="3"/><path fill="none" stroke="#FFF" stroke-width="2" stroke-miterlimit="10" d="M272 428h-44"/></g></g><g id="_x3C_CrossBand_-_Right_x3E__1_"><path id="_x3C_CrossBand_-_Body_x3E__1_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M230 280l21 297-19 1-15-260z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M238 374s-2 18-7 18-10-16-10-16"/><circle fill="#22201E" cx="226" cy="327" r="2"/><circle fill="#22201E" cx="226" cy="341" r="2"/><path fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M237 339c2 3 5 6 5 9a14 14 0 1 1-28 5"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M227 348l2 18"/></g></g></g><g id="_x3C_SHIRT_-_Right_x3E_"><g id="_x3C_Shirt_-_Gray_Section_x3E_"><path id="_x3C_Shirt_-_Gray_x3E_" fill="#D2D3D4" d="M353 266l36 11-2 301-95-1V357l61-90"/><g id="Shirt_-_Pocket2_x3E_"><path id="_x3C_Shirt_-_PocketBody_x3E_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M359 379v-18h-47v18c0 2-1 20 23 20 25 0 24-18 24-20z"/><g id="_x3C_Shirt_-_PocketDetail_x3E_"><circle fill="#FFF" cx="335" cy="368" r="3"/><path fill="none" stroke="#FFF" stroke-width="2" stroke-miterlimit="10" d="M313 376h45"/></g></g><g id="Shirt_-_Pocket1_x3E_"><path id="_x3C_Shirt_-_PocketBody_x3E__1_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M359 431v-18h-47v18c0 2-1 20 23 20 25 0 24-18 24-20z"/><g id="_x3C_Shirt_-_PocketDetail_x3E__1_"><circle fill="#FFF" cx="335" cy="420" r="3"/><path fill="none" stroke="#FFF" stroke-width="2" stroke-miterlimit="10" d="M313 428h45"/></g></g><g id="_x3C_Shirt_Buttoms_-_Bottom_x3E_" fill="#22201E"><circle cx="301" cy="392" r="2"/><circle cx="301" cy="436" r="2"/></g><g id="_x3C_CrossBand_-_Right_x3E_"><path id="_x3C_CrossBand_-_Body_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M356 280l-24 297 21 1 16-260z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M348 374s1 18 7 18 10-16 10-16"/><circle fill="#22201E" cx="360" cy="327" r="2"/><circle fill="#22201E" cx="359" cy="341" r="2"/><path fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M349 339c-3 3-5 6-5 9a14 14 0 1 0 28 5"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M359 348l-2 18"/></g></g></g><path id="_x3C_ShirtLine_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M292 577V318"/></g><g id="Plants-mid" clip-path="url(#junglemasky)"><g id="_x3C_BLACK_FERN_x3E_"><g style="animation-name:leafystreatchin2;animation-duration:1.15s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:250px 578.217px;animation-iteration-count:1"><g class="leftplantwave" style="animation-name:leftplantywafe;animation-duration:3.2s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:250.667px 578.217px" id="_x3C_Black_Leave_-_Left_x3E_"><path id="_x3C_Leaf_Body_x3E__1_" fill="#22201E" d="M76 514c0-14 15-16 20-18s4-7 0-8-37-5-37-20c0-11 21-18 25-20 7-2 4-5 0-7s-32-6-33-23c0-14 19-17 21-17 4-1 6-5 2-7-31-18-23-28-21-29s5-2 9-1 6-2 5-5-25-49-13-56c18-11 37 31 39 37 2 5 8 5 7 0 0-3-1-17 10-20 17-4 25 46 24 50s2 5 3 1c1-5 13-32 27-23 10 6-4 36-6 39-1 2 2 4 4 1 3-4 21-26 36-20s9 30 9 36 6 5 8 3 11-12 20-4 0 35-2 40 4 7 7 5 23-24 41-13-4 62-6 65 3 5 6 2c3-2 37-28 51-12s-10 39-13 43c-4 3-3 8 0 9 35 11 26 36 26 36H150l-74-64z"/><g id="_x3C_Leaf_Veins_x3E__1_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path d="M258 575s-3-52-76-106S80 360 72 332"/><path d="M272 449s-18 10-25 34c-5 17-9 22-18 30M315 504s-21 12-30 20-15 22-32 29M226 413s-8 11-12 25-4 26-19 41M114 333s8 44 2 74M144 437s6-12 9-46M101 388s-12 2-39-14M127 420s-19 8-61-2M165 455s-17 8-33 10c-17 2-47 4-51 3M200 483s-24 12-44 17-52 10-64 11M193 383c-1 2-15 22-15 52l-1 30"/><path id="_x3C_Outline_x3E__1_" d="M279 503c2-3 39-30 54-14 14 17-9 40-12 43-6 4-6 9 1 10 10 3 17 9 21 15"/><path d="M245 489s-8-9-7-24"/></g></g></g><g style="animation-name:leafystreatchin;animation-duration:1.15s;animation-timing-function:cubic-bezier(.88,.77,.51,1.37);transform-origin:327.667px 578.217px;animation-iteration-count:1"><g class="rightplantwave" style="animation-name:plantywafe;animation-duration:3.3s;animation-timing-function:ease-in-out;animation-iteration-count:infinite;transform-origin:327.667px 578.217px" id="_x3C_Black_Leave_-_Right_x3E_"><path id="_x3C_Leaf_Body_x3E_" fill="#22201E" d="M510 514c0-14-15-16-21-18s-3-7 1-8 36-5 37-20c0-11-21-18-25-20-7-2-4-5 0-7s32-6 33-23c0-14-19-17-21-17-4-1-6-5-2-7 31-18 22-28 21-29s-5-2-9-1-7-2-5-5 25-49 13-56c-18-11-37 31-39 37-2 5-8 5-8 0 1-3 1-17-10-20-16-4-24 46-23 50s-2 5-3 1c-1-5-14-32-28-23-9 6 5 36 6 39 2 2-1 4-3 1-3-4-21-26-36-20s-9 30-9 36-7 5-8 3-11-12-20-4 0 35 1 40-3 7-6 5-24-24-41-13 4 62 5 65-2 5-5 2-37-28-51-12 10 39 13 43c4 3 3 8 0 9-35 11-27 36-27 36h196l74-64z"/><g id="_x3C_Leaf_Veins_x3E_" fill="none" stroke="#69BF56" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><path d="M328 575s3-52 76-106 102-109 110-137"/><path d="M314 449s18 10 25 34c5 17 9 22 18 30M271 504s21 12 29 20c9 8 21 18 38 18M359 413s9 11 12 25 4 26 20 41M472 333s-8 44-2 74M441 437s-5-12-8-46M485 388s12 2 39-14M459 420s19 8 61-2M421 455s17 8 33 10 47 4 51 3M386 483a293 293 0 0 0 108 28M394 378c1 14 22 31 23 50v32"/><path id="_x3C_Outline_x3E_" d="M307 503c-3-3-40-30-54-14s9 40 12 43c6 4 6 9-1 10-11 3-17 9-21 15"/></g></g></g></g></g><g id="HUMAN_-_Front_Section"><g id="_x3C_Hair_-_BACK_-_Left_x3E_"><path id="_x3C_Hair_-_Body_-_Left_x3E_" fill="#68C156" d="M292 126s-10 21-39 29c-3 0-3 48-21 81-15 28-48 43-48 43s-18 4-26 24c0 0-7-7-6-20s18-26 19-39 13-21 26-23c14-2 34-15 37-31 3-10-12-70 58-64z"/><path id="_x3C_Hair_-_Line_-_Left_x3E__2_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M185 234s-4 2-4 6c-1 5 3 8 3 16-1 8-17 10-17 26v7"/></g><g id="_x3C_BIRD_x3E_" style="animation-name:birdpop;animation-duration:2.01s;animation-iteration-count:1;transform-origin:292px 124px"><g id="_x3C_BEAK_x3E_" fill="#22201E"><path id="_x3C_Beak_-_Bottom_x3E_" d="M282 45l-3 3-6-3h9z"/><path id="_x3C_Beak_-_Top_x3E_" d="M282 45l-2-4-7 4"/></g><path id="_x3C_Bird_-_Body_x3E_" fill="#69BF56" d="M306 71c4 2-18-12-14-33 1-3 0-4-3-3l-9 6 1 4c0 2-2 3-2 3s-7 10-7 16c0 2 1 6 6 7h28z"/><ellipse id="_x3C_Bird_-_Eye_x3E_" fill="#22201E" cx="285" cy="44" rx="1" ry="2"/><path id="_x3C_Bird_-_Feather_x3E_" fill="none" stroke="#22201E" stroke-linecap="round" stroke-miterlimit="10" d="M288 39l5-4"/><path id="_x3C_Bird_-_Feather_x3E__1_" fill="none" stroke="#22201E" stroke-linecap="round" stroke-miterlimit="10" d="M290 42l3-3"/><path id="_x3C_Bird_-_Wing_x3E_" fill="none" stroke="#22201E" stroke-linecap="round" stroke-miterlimit="10" d="M286 53s-8 7 1 17"/></g><g id="_x3C_HAT_x3E_"><g id="_x3C_Hat_-_TopSection_x3E_"><path fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M292 68s-51 6-51 54h51V68z"/><circle fill="#22201E" cx="280" cy="87" r="3"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M254 87s22 6 38 32M248 93s20 5 36 29"/><g><path fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M292 68s51 6 51 54h-51V68z"/><circle fill="#22201E" cx="304" cy="87" r="3"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M330 87s-22 6-38 32M336 93s-20 5-36 29"/></g><path id="_x3C_Hat_-_Top_Bottom_x3E_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M287 68c0-3 2-5 5-5s5 2 5 5h-10z"/></g><g id="_x3C_Hat_-_Shield_x3E_" stroke-width="2" stroke-miterlimit="10"><ellipse fill="#D2D3D4" stroke="#22201E" cx="293" cy="134" rx="92" ry="26"/><path fill="#22201E" stroke="#22201E" d="M340 137c0 7-21 14-47 14s-47-7-47-14 21-12 47-12 47 5 47 12z"/><ellipse fill="none" stroke="#A7ABAC" cx="293" cy="134" rx="76" ry="21"/><ellipse fill="none" stroke="#A7ABAC" cx="293" cy="136" rx="61" ry="17"/></g></g><path id="_x3C_Neck_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M315 228l-23 11-23-7s-3 25-28 35l51 59 52-59c-25-10-29-39-29-39z"/><g id="_x3C_FACE_x3E_"><path id="_x3C_Face_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M292 237c3 0 41-2 41-59v-40c0-5 2-13-41-13-42 0-41 8-41 13v40c0 57 38 59 41 59z"/><path id="_x3C_Face_-_Shadow_x3E_" fill="#22201E" d="M292 237c-3 0-41-2-41-59v-38c-2 2-2 4-2 6v41c0 56 22 58 41 58 4 0 16 0 26-11l-1-6c-10 8-21 9-23 9z"/><path id="_x3C_Nose_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M293 176s1 17 7 27h-8"/><path id="_x3C_Mouth_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M286 212l6 2c2 0 2-1 2-2s0-2-2-2l-6 2z"/></g><g id="_x3C_SHIRT_x3E_"><g id="_x3C__RIGHT_SECTION_x3E_"><path id="_x3C_HAIR_FRONT_-_right" fill="#68C156" d="M292 126s8 16 29 25c3 2 32 10 22-7-7-12-22-21-51-18z"/><g id="_x3C_Shirt_-_Collar_Section_x3E_"><g id="_x3C_Shirt_-_Collar_-_Right_x3E__1_"><path id="_x3C_Shirt_-_White_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-linejoin="bevel" stroke-miterlimit="10" d="M292 318l50-54 11 2s0 69-61 91v-39z"/><g id="_x3C_Shirt_-_Collar_-_Right_x3E_"><path fill="#D2D3D4" d="M342 265s-12 48-49 58v-6l49-52z"/><path id="_x3C_Shirt_-_Collar_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M292 318s37-34 40-63l10 9s1 29-16 53l-10-18s-10 10-24 19z"/><path id="_x3C_Shirt_-_CollarLine_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M324 251s7 1 18 13"/></g></g><g id="_x3C_Shirt_-_Bottoms_x3E_" fill="#22201E"><circle cx="301" cy="325" r="3"/><circle cx="301" cy="346" r="3"/></g></g><g id="_x3C_ARM_-_Right_x3E_"><path id="_x3C_Arm_-_Body_x3E_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M354 267l-6 2 1-17 33-7 4 12c11 7 16 23 16 23 11 3 26 11 30 34 5 29 4 70 3 82s3 57-23 57c-25 0-28-31-29-36l-29-150z"/><path id="_x3C_Arm_-_CuffShadow_x3E_" fill="#22201E" d="M386 257l-33 9 2 11 32-19z"/><path id="_x3C_Arm_-_ShadowCap_x3E_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" stroke-miterlimit="10" d="M372 266s12 38 13 47c0 6-2 10-6 4-6-9-7-35-7-51z"/><path id="_x3C_Arm_-_ShadowLine_x3E__3_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M389 273s-5-9-10-11"/><path id="_x3C_Arm_-_ShadowLine_x3E__2_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M377 339s14 12 15 18"/><path id="_x3C_Arm_-_ShadowLine_x3E__1_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M427 404s-23-113-27-127-13-19-13-19"/><path id="_x3C_Arm_-_ShadowLine_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M430 391s-3-3-7-3"/><path id="_x3C_Arm_-_Shadow_x3E__1_" fill="#22201E" d="M414 285l-12-5 23 114-11-109z"/><path id="_x3C_Arm_-_Shadow_x3E_" fill="#22201E" d="M412 440c-22 2-26-12-26-12l1 5c4 10 11 20 25 20s20-14 22-28v-13c-4 17-13 27-22 28z"/><circle id="_x3C_Arm_-_Cuff_Buttom_x3E_" fill="#6ABF58" cx="357" cy="258" r="2"/></g><g id="_x3C_HAND_-_Right_x3E_" stroke="#22201E" stroke-width="2" stroke-miterlimit="10"><path id="_x3C_Hand_-_Body_x3E_" fill="#FFF" d="M382 245s-8-18-7-30 6-26 5-39-9-30-20-28c10 40-14 55-14 60 0 6 0 30 7 37v6l29-6z"/><path id="_x3C_Hand_-_SHadowLine_x3E_" fill="none" stroke-linecap="round" d="M351 220c0-10 3-14 8-20"/></g></g><g id="_x3C_LEFT_SECTION_x3E_"><g id="_x3C_Shirt_-_Collar_-_Left_x3E_"><path id="_x3C_Shirt_-_White_x3E__1_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-linejoin="bevel" stroke-miterlimit="10" d="M292 318l-49-55-11 2s0 70 60 92v-39z"/><g id="_x3C_Shirt_-_Collar_-_Right_x3E__3_"><path fill="#D2D3D4" d="M243 264s12 49 48 59v-6l-48-53z"/><path id="_x3C_Shirt_-_Collar_x3E__1_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M292 318s-36-34-38-64l-11 9s-1 29 15 53l11-18s10 11 23 20z"/><path id="_x3C_Shirt_-_CollarLine_x3E__1_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M262 251s-8 1-19 12"/></g></g><g id="_x3C_HAIR_FRONT_-_Left_x3E_"><path id="_x3C_Hair_-_Body_-_Left_x3E__1_" fill="#68C156" d="M234 190c4-10-12-70 58-64 0 0-10 21-39 29-6 1-26 26 11 64 5 6 8 9 8 16s-4 9-4 18 11 22 11 30-9 12-9 27 15 20 15 20-11 7-33 9c-38 4-68-60-68-60s27-22 50-89z"/><path id="_x3C_Hair_-_Line_-_Left_x3E__1_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M254 262s-8 1-18 6"/><path id="_x3C_Hair_-_Line_-_Left_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M260 275s2 3 2 8c0 9-8 20-8 27 0 10 12 15 12 15"/></g><g id="_x3C_ARM_-_Left_x3E_"><path id="_x3C_Arm_-_Body_x3E__1_" fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M232 267l6 2-1-17-34-7-3 12c-11 7-16 23-16 23-11 3-26 11-30 34-5 29-4 70-4 82s-2 57 23 57c26 0 29-31 30-36l29-150z"/><path id="_x3C_Arm_-_CuffShadow_x3E__1_" fill="#22201E" d="M200 257l32 9-2 11-31-19z"/><path id="_x3C_Arm_-_ShadowCap_x3E__1_" fill="#D2D3D4" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" stroke-miterlimit="10" d="M214 266s-12 38-13 47c0 6 2 10 6 4 6-9 6-35 7-51z"/><path id="_x3C_Arm_-_ShadowLine_x3E__7_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M197 273s5-9 10-11"/><path id="_x3C_Arm_-_ShadowLine_x3E__6_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M209 339s-14 12-16 18"/><path id="_x3C_Arm_-_ShadowLine_x3E__5_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M159 404s23-113 27-127 13-19 13-19"/><path id="_x3C_Arm_-_ShadowLine_x3E__4_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M156 391s3-3 6-3"/><path id="_x3C_Arm_-_Shadow_x3E__3_" fill="#22201E" d="M171 285l13-5-23 114 10-109z"/><path id="_x3C_Arm_-_Shadow_x3E__2_" fill="#22201E" d="M174 440c21 2 25-12 25-12v5c-4 10-11 20-26 20-14 0-19-14-21-28v-13c4 17 12 27 22 28z"/><circle id="_x3C_Arm_-_Cuff_Buttom_x3E__1_" fill="#6ABF58" cx="228" cy="258" r="2"/></g><g id="_x3C_HAND_-_Leftt_x3E_" stroke="#22201E" stroke-width="2" stroke-miterlimit="10"><path id="_x3C_Hand_-_Body_x3E__1_" fill="#FFF" d="M203 245s8-18 8-30-6-26-5-39 8-30 19-28c-9 40 14 55 15 60 0 6 0 30-8 37v6l-29-6z"/><path id="_x3C_Hand_-_SHadowLine_x3E__1_" fill="none" stroke-linecap="round" d="M235 220c0-10-3-14-8-20"/></g></g><path id="_x3C_ShirtLine_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M292 491V318"/></g><g id="_x3C_LENSES_x3E_"><g id="_x3C_Lenses_-_Left_x3E_"><path fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M293 173c0 18-12 33-28 37-3 1-8 12-18 11-9 0-3-12-6-13a38 38 0 1 1 52-35z"/><path fill="#68C159" d="M286 173c0 16-12 29-27 31 0 0-4 10-11 11l-1-12a31 31 0 1 1 39-30z"/><path fill="#231F20" d="M282 173c0 14-11 25-25 26-1 0-3 7-5 7l-1-7a27 27 0 1 1 31-26z"/><circle fill="#FFF" cx="240" cy="173" r="5"/><circle fill="#FFF" cx="255" cy="173" r="5"/><circle fill="#FFF" cx="270" cy="173" r="5"/></g><g id="_x3C_Lenses_-_Right_x3E_"><path fill="#FFF" stroke="#22201E" stroke-width="2" stroke-miterlimit="10" d="M294 173c0 18 12 33 28 37 3 1 8 12 18 11 9 0 3-12 6-13a38 38 0 1 0-52-35z"/><path fill="#68C159" d="M301 173c0 16 12 29 27 31 0 0 4 10 11 11l1-12a31 31 0 1 0-39-30z"/><path fill="#231F20" d="M305 173c0 14 11 25 25 26 1 0 3 7 5 7l1-7a27 27 0 1 0-31-26z"/><circle fill="#FFF" cx="347" cy="173" r="5"/><circle fill="#FFF" cx="332" cy="173" r="5"/><circle fill="#FFF" cx="317" cy="173" r="5"/></g></g></g><g id="PLANTS_-_Front_Section" clip-path="url(#junglemasky)"><g id="Layer_7"><g id="_x3C_GREEN_FERN_x3E_"><g id="_x3C_Green_Fern_-_Right_x3E_"><path class="leaf8 leafy" id="_x3C_1_Leaf_x3E_" fill="#69C159" d="M368 577h78s-4-7-35-10c-34-3-44 7-43 10z" style="animation-duration:.8s"/><g class="leaf7 leafy" id="_x3C_4_Leaf_x3E__1_" style="animation-duration:.9s"><path id="_x3C_4_Leaf_x3E_" fill="#69C159" d="M353 521c-1 2 8 16 32 31 13 7 54 22 57 18s-4-18-24-29c-36-21-64-22-65-20z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M369 530l45 23"/></g><g class="leaf6 leafy" id="_x3C_5_Leaf_x3E_" style="animation-duration:1s"><path class="shadowleafy" id="_x3C_5_Leaf_-_Shadow_x3E_" fill="#22201E" d="M442 570c5 2-4-18-24-29l-12-6s23 29 36 35z"/><path fill="#69C159" d="M370 465c-2 2 6 27 27 54 11 15 46 50 53 43 7-6 4-22-15-45-31-39-63-54-65-52z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M386 484l55 62"/></g><g class="leaf5 leafy" id="_x3C_6_Leaf_x3E_" style="animation-duration:1.1s"><path fill="#69C159" d="M481 409c-2 0-16 22-25 55-8 32-11 100-1 102 9 1 21-42 28-71 10-49 1-86-2-86z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M479 428s-18 73-19 98"/></g><g class="leaf4 leafy" id="_x3C_7_Leaf_x3E_" style="animation-duration:1.2s"><path class="shadowleafy" id="_x3C_7_Leaf_-_Shadow_x3E__1_" fill="#22201E" d="M456 463c3 11 5 24 6 39 1 29 0 74-9 75-6 1-3-78-1-92l4-22z"/><path class="shadowleafy" id="_x3C_7_Leaf_-_Shadow_x3E_" fill="#22201E" d="M450 562c8 3-22-54-26-58l-7-7s22 60 33 65z"/><path fill="#69C159" d="M417 422c-2 1-5 27 2 61 6 32 32 88 42 85 8-2 3-41-4-69-12-49-37-78-40-77z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M453 537s-15-72-31-94"/></g><g class="leaf3 leafy" id="_x3C_2_Leaf_x3E_" style="animation-duration:1.3s"><path class="shadowleafy" id="_x3C_2_Leaf_-_Shadow_x3E_" fill="#22201E" d="M375 570c8 3 17 6 29 7h42l-69-9-2 2z"/><path fill="#69C159" d="M348 551c0 3 29 29 98 26 0 0 10-15-30-25s-67-4-68-1z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M427 569s-36-13-60-15"/></g><g class="leaf2 leafy" id="_x3C_3_Leaf_x3E_" style="animation-duration:1.4s"><path fill="#69C159" d="M524 560c0 2-4 8-42 17h-52c-1-2 2-13 45-21 24-4 48 1 49 4z"/><path class="shadowleafy" fill="#22201E" d="M446 577h12s28-14 38-22h-13l-37 22z"/></g><g class="leaf1 leafy" id="_x3C_8_Leaf_x3E_" style="animation-duration:1.5s"><path class="shadowleafy" id="_x3C_8_Leaf_-_Shadow_x3E_" fill="#22201E" d="M441 577h-12c-2-2-6-16 39-58 3-4 7-7 12-10l-4 16-35 52z"/><path fill="#69C159" d="M536 493c2 2-11 32-41 54-27 19-44 28-54 30h-12c-2-2-5-16 44-54 28-22 62-32 63-30z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M431 575s56-48 90-69"/></g></g><g id="_x3C_Green_Fern_-_Left_x3E_"><path class="leaf8 leafy" id="_x3C_1_Leaf_x3E__1_" fill="#69C159" d="M218 577h-78s4-7 35-10c33-3 44 7 43 10z" style="animation-duration:.8s"/><g class="leaf7 leafy" id="_x3C_4_Leaf_x3E__2_" style="animation-duration:.9s"><path id="_x3C_4_Leaf_x3E__3_" fill="#69C159" d="M233 521c1 2-8 16-32 31-13 7-55 22-58 18-2-4 5-18 25-29 36-21 64-22 65-20z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M217 530l-45 23"/></g><g class="leaf6 leafy" id="_x3C_5_Leaf_x3E__1_" style="animation-duration:1s"><path class="shadowleafy" id="_x3C_5_Leaf_-_Shadow_x3E__1_" fill="#22201E" d="M143 570c-4 2 5-18 25-29l12-6s-23 29-37 35z"/><path fill="#69C159" d="M216 465c2 2-6 27-27 54-12 15-46 50-53 43-7-6-4-22 15-45 31-39 63-54 65-52z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M200 484l-56 62"/></g><g class="leaf5 leafy" id="_x3C_6_Leaf_x3E__1_" style="animation-duration:1.1s"><path fill="#69C159" d="M105 409c2 0 16 22 25 55 8 32 11 100 1 102-9 1-22-42-28-71-11-49-2-86 2-86z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M107 428s18 73 19 98"/></g><g class="leaf4 leafy" id="_x3C_7_Leaf_x3E__1_" style="animation-duration:1.2s"><path class="shadowleafy" id="_x3C_7_Leaf_-_Shadow_x3E__3_" fill="#22201E" d="M129 463l-5 39c-1 29 0 74 9 75 6 1 3-78 1-92-2-15-5-22-5-22z"/><path class="shadowleafy" id="_x3C_7_Leaf_-_Shadow_x3E__2_" fill="#22201E" d="M136 562c-9 3 22-54 25-58l8-7s-22 60-33 65z"/><path fill="#69C159" d="M169 422c2 1 5 27-2 61-7 32-32 88-42 85-8-2-3-41 4-69 12-49 37-78 40-77z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M133 537s14-72 30-94"/></g><g class="leaf3 leafy" id="_x3C_2_Leaf_x3E__1_" style="animation-duration:1.3s"><path class="shadowleafy" id="_x3C_2_Leaf_-_Shadow_x3E__1_" fill="#22201E" d="M210 570c-7 3-17 6-28 7h-42l68-9 2 2z"/><path fill="#69C159" d="M237 551c1 3-28 29-97 26 0 0-11-15 30-25 40-10 67-4 67-1z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M159 569s36-13 60-15"/></g><g class="leaf2 leafy" id="_x3C_3_Leaf_x3E__1_" style="animation-duration:1.4s"><path fill="#69C159" d="M62 560c0 2 4 8 41 17h53c1-2-2-13-45-21-24-4-48 1-49 4z"/><path class="shadowleafy" fill="#22201E" d="M140 577h-12s-28-14-38-22h13l37 22z"/></g><g class="leaf1 leafy" id="_x3C_8_Leaf_x3E__1_" style="animation-duration:1.5s"><path class="shadowleafy" id="_x3C_8_Leaf_-_Shadow_x3E__1_" fill="#22201E" d="M145 577h11c3-2 7-16-38-58l-12-10 4 16 35 52z"/><path fill="#69C159" d="M50 493c-2 2 11 32 41 54 27 19 44 28 54 30h11c2-2 5-16-43-54-28-22-62-32-63-30z"/><path fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M155 575s-56-48-90-69"/></g></g></g></g><g id="_x3C_TWICKS_x3E_" fill="none" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10"><g id="_x3C_Twick_Set_-_Left_x3E_"><g id="_x3C_Twick_Brown_-_Left_x3E_" stroke="#22201E"><path d="M80 570s7 3 10 7c0-1-1-6-4-11M96 565l-2 7"/></g><g id="_x3C_Twick_Green_-_Left_x3E_" stroke="#69BF56"><path d="M247 570l-10 7c0-1 0-6 4-11M231 566l1 6"/></g></g><g id="_x3C_Twick_Set_-_Right_x3E_"><g id="_x3C_Twick_Brown_-_Left_x3E__1_" stroke="#22201E"><path d="M516 570l-10 7c0-1 1-6 5-11M500 565l2 7"/></g><g id="_x3C_Twick_Green_-_Left_x3E__1_" stroke="#69BF56"><path d="M349 570l10 7c0-1 0-6-4-11M365 566l-1 6"/></g></g></g><g id="_x3C_WORM_x3E_"><path fill="#69BF56" d="M278 553c1-1 2-4 0-5s-5-2-7 1-5 11-4 18 8 10 11 10c8 1 13-10 17-10s5 9 13 9c6 0 8-3 9-6 3-3 0-7-3-7-4 0-5 10-9 3-3-3-5-9-10-9s-10 6-14 10c-1 2-6 4-6-4 0-4 1-8 3-10z"/><path fill="none" stroke="#22201E" stroke-miterlimit="10" d="M267 561h8M276 567l-6 6M281 567l5 7M287 561l5 7M302 561l-5 7M307 568l-5 7M309 568l7 5"/><circle fill="#22201E" cx="272" cy="566" r="2"/><circle fill="#22201E" cx="276" cy="550" r="1"/><circle fill="#22201E" cx="273" cy="549" r="1"/><circle fill="#22201E" cx="278" cy="572" r="2"/><circle fill="#22201E" cx="287" cy="567" r="2"/><circle fill="#22201E" cx="295" cy="561" r="2"/><circle fill="#22201E" cx="302" cy="568" r="2"/><circle fill="#22201E" cx="308" cy="573" r="2"/><circle fill="#22201E" cx="314" cy="567" r="2"/></g><path id="_x3C_Baseline_x3E_" fill="none" stroke="#22201E" stroke-width="2" stroke-linecap="round" stroke-miterlimit="10" d="M538 578H52"/></g></g></svg>

<br><br>
<font size="7" color="gray" face="Jua"><a href="#gg">당신이 궁금해요</a></font>
 <!-- <h2><strong>어디서 찾나 나의 가성비는 <a href="#gg">↓↓</a></strong></h2>
 -->

	<!-- 회원가입 페이지에서도 menubar는 노출되도록 -->
	<%@ include file="../common/menubar.jsp" %>
	
	<div class="outer">
		<br>
	<!-- 	<div class="main"> -->
	<!-- 	<h4 align="center">어서 같이 좋은 물건을 찾으러가요! <a href="#gg">↓↓</a></h4>
		<br><br> -->
		<h4 align="center"><a name="gg">회원가입</a></h4>
		
		<fieldset>
		 <form id="joinForm" action="<%= request.getContextPath() %>/insert.me" method="post" onsubmit="return joinValidate();"> 
			
			<table>
				<tr>
		
                <label for="name"></label>
                <input type="text" id="name" name="userId" placeholder="* 아이디" required >
                <span id="MsgName" class="none"></span>               
                                             
			        
				<div id="idCheck"> 중복확인</div>
		
				</tr>
				<tr>
					  <label for="pwd"></label> 
				 	  <input type="password" id="pwd" maxlength="15" name="userPwd" placeholder="* 비밀번호" onblur="ck_pwd()" required>
                      <span id="MsgPw" class="none"></span>
			
				</tr>
				<tr>
				<label for="pwd_ck"></label> 
				<input type="password" id="pwd_ck" maxlength="15"  name="userPwd2" placeholder="* 비밀번호 확인" onblur="ck_pwd2()" required>
                <span id="MsgPwck" class="none"></span>
				<!-- <td><label id="pwdResult"></label></td> -->
				</tr>
				<tr>
				<label for="name"></label>
				<input type="text" id="name"  maxlength="5" name="userName" placeholder="*이름" required>
                <span id="MsgName" class="none"></span>
                
                </tr>
				<tr>
				<label for="birthDate"></label> 
				<input type="text" id="name" maxlength="8" name="birthDate" placeholder="* 주민등록번호(19951105)" required>
                <span id="MsgName" class="none"></span>
               
				</tr>
				<tr>
				<label for="gender"></label> 
				<input type="text" maxlength="1" name="gender" placeholder="성별(M/F)기입">
				</tr>
				<tr>
				 <label for="email"></label> 
				 <input type="email" id="email" name="email" placeholder="이메일(ex@codepen.com)" onblur="ck_email()"> 
                 <span id="MsgId" class="none"></span>
				</tr>
				<tr>
				<label for="phone"></label> 
				<input type="text" maxlength="13" name="phone" placeholder="* 연락처(010-1234-5678)">
				</tr>
				<tr>
				<label for="address"></label> 
				<!--<input type="text" name="address" placeholder="주소"> -->
				우편번호 : <input type="text" name="address" style="width:80px; height:26px;" />	&nbsp;&nbsp;
				<button type="button" style="width:60px; height:32px;" onclick="openZipSearch()">검색</button><br>
				주소 : <input type="text" name="addr1" style="width:300px; height:30px;" readonly /><br>
				상세 : <input type="text" name="addr2" style="width:300px; height:30px;" />
				</tr>
				
				
			
			
			
			</table>
			
			<div class="btns" align="center">
				<div id="goMain" onclick="goMain();">메인으로</div>
				&nbsp;&nbsp;
				<input type="submit" value="가입하기" id="joinBtn">
			</div>
			
			</form>
		</fieldset>
	</div>
	
	
	
	<script>
		function goMain(){
			location.href="<%= request.getContextPath() %>";
		}
		
		function joinValidate(){
			
			// 아이디 검사
			if(!(/^[a-z][a-z\d]{3,11}$/i.test($("#joinForm input[name=userId]").val()))){
				$("#joinForm input[name=userId]").focus();
				return false;
			}
			
			// 비밀번호와 비밀번호 확인 일치하는지
			if($("#joinForm input[name=userPwd]").val() != $("#joinForm input[name=userPwd2]").val()){
				$("#pwdResult").text("비밀번호 불일치").css("color", "red");
				return false;
			}
			
			// 이름 검사
			if(!(/^[가-힣]{2,}$/.test($("#joinForm input[name=userName]").val()))){
				$("#joinForm input[name=userName]").focus();
				return false;
			}
			
			return true;
			
			
			
		}
		
		$(function(){
			
			var isUsable = false;
			
			$("#idCheck").click(function(){
				
				var userId = $("#joinForm input[name=userId]");
				
				$.ajax({
					url:"idCheck.me",
					type:"post",
					data:{userId:userId.val()},
					success:function(result){
						
						if(result == "fail"){ // 사용불가
							alert("사용할수 없는 아이디 입니다!");
							userId.focus();
							
						}else{ // 사용가능
							
							if(confirm("사용 가능한 아이디입니다. 사용하시겠습니까?")){
								userId.attr("readonly", "true"); // 더 이상 바꿀수 없도록
								isUsable = true;
							}else{
								userId.focus();
							}
							
						}
						
						if(isUsable){
							$("#joinBtn").removeAttr("disabled");
						}
						
					},
					error:function(){
						console.log("서버 통신 안됨");
					}
				});
				
			});
			
		});
		
		
		
		// id,pw,email 유효성
function ck_email(){
        var email = document.getElementById("email")
        var MsgId = document.getElementById("MsgId")
        var isEmail = /([\w\-]+\@[\w\-]+\.[\w\-]+)/
        if(!isEmail.test(email.value)){
            MsgId.style.display="block";
            MsgId.className='error'
            MsgId.innerHTML="이메일 형식을 확인하세요"
            email.focus()
            return false;
        } else{
            MsgId.className='vaild'
            MsgId.innerHTML="ok"
        }   
}
function ck_pwd(){
        var pwd = document.getElementById("pwd")
        var MsgPw = document.getElementById("MsgPw")
        var isPwd = /^(?=.*[a-zA-Z])((?=.*\d)|(?=.*\W)).{6,20}$/
        
        if(!isPwd.test(pwd.value)){
            MsgPw.style.display="block";
            MsgPw.className='error'
            MsgPw.innerHTML="숫자포함 최소 6자리 이상"
            pwd.focus()
            return false;
        } else{
            MsgPw.className='vaild'
            MsgPw.innerHTML="ok"
        }   
}
function ck_pwd2(){
        var pwd_ck = document.getElementById("pwd_ck")
        var pwd = document.getElementById("pwd").value
        var MsgPwck = document.getElementById("MsgPwck")
        
        if(pwd_ck.value!=pwd){
            MsgPwck.style.display="block";
            MsgPwck.className='error'
            MsgPwck.innerHTML="비밀번호가 일치하지 않습니다."
            pwd_ck.focus()
            return false;
        } else{
            MsgPwck.className='vaild'
            MsgPwck.innerHTML="ok"
        }   
}
function ck_gender(){
    var wrap_gender = document.getElementById("wrap_gender")
    var man = document.getElementById("man")
    var woman = document.getElementById("woman")
    var MsgGender = document.getElementById("MsgGender")
    
    if(man.checked){
        document.getElementById("wrap_man").className='gender_act';
        document.getElementById("wrap_woman").className='gender';
    }
    
    if(woman.checked){
        document.getElementById("wrap_woman").className='gender_act';
        document.getElementById("wrap_man").className='gender';
    }
    
    
}
 function openZipSearch() {
	new daum.Postcode({
		oncomplete: function(data) {
			$('[name=address]').val(data.zonecode); // 우편번호 (5자리)
			$('[name=addr1]').val(data.address);
			$('[name=addr2]').val(data.buildingName);
		}
	}).open();
}
 
		
		
	</script>
	
</body>
</html>
